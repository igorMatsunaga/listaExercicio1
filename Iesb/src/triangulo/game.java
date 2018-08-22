package triangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class game extends JFrame {
	public static int randInt(int min, int max)
	{
	java.util.Random rand = new java.util.Random();
	int randomNum = rand.nextInt((max - min) + 1) + min;
	return randomNum;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedraPapelOu = new JLabel("Pedra, Papel ou Tesoura?");
		lblPedraPapelOu.setBounds(30, 29, 189, 14);
		contentPane.add(lblPedraPapelOu);
		
		JRadioButton rdbtnPedra = new JRadioButton("Pedra");
		rdbtnPedra.setBounds(28, 50, 109, 23);
		contentPane.add(rdbtnPedra);
		
		JRadioButton rdbtnPapel = new JRadioButton("Papel");
		rdbtnPapel.setBounds(30, 76, 109, 23);
		contentPane.add(rdbtnPapel);
		
		JRadioButton rdbtnTesoura = new JRadioButton("Tesoura");
		rdbtnTesoura.setBounds(28, 102, 109, 23);
		contentPane.add(rdbtnTesoura);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int x = randInt(0, 2);
														
				if(rdbtnPedra.isSelected()) {
					if (x == 0 ) {
						JOptionPane.showMessageDialog(null,"Empate!!");
						
						rdbtnPedra.setSelected(false);
					}
					if (x < 1 ) {
						JOptionPane.showConfirmDialog(null, "Não foi desta vez, Jogue Novamente!!");
						rdbtnPedra.setSelected(false);

					}else {
						JOptionPane.showMessageDialog(null, "Você venceu!!");
						rdbtnPedra.setSelected(false);

					}
						
				}
				if(rdbtnPapel.isSelected()) {
					if (x == 1 ) {
						JOptionPane.showMessageDialog(null,"Empate!!");
						rdbtnPapel.setSelected(false);
					}
					if (x < 2 ) {
						JOptionPane.showConfirmDialog(null, "Não foi desta vez, Jogue Novamente!!");
						rdbtnPapel.setSelected(false);

					}else {
						JOptionPane.showMessageDialog(null, "Você venceu!!");
						rdbtnPapel.setSelected(false);

					}
				}
				if(rdbtnTesoura.isSelected()) {
					if (x == 2 ) {
						JOptionPane.showMessageDialog(null,"Empate!!");
						rdbtnTesoura.setSelected(false);
					}
					if (x < 1 ) {
						JOptionPane.showConfirmDialog(null, "Não foi desta vez, Jogue Novamente!!");
						rdbtnTesoura.setSelected(false);

					}else {
						JOptionPane.showMessageDialog(null, "Você venceu!!");
						rdbtnTesoura.setSelected(false);

						
					}
					
				}
			}
		});
		btnJogar.setBounds(93, 162, 89, 23);
		contentPane.add(btnJogar);
		
	}
}
