package triangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pesoPlaneta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final JRadioButton True = null;
	protected static final JRadioButton False = null;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pesoPlaneta frame = new pesoPlaneta();
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
	public pesoPlaneta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoNaTerra = new JLabel("Peso na Terra (Kg):");
		lblPesoNaTerra.setBounds(21, 11, 109, 14);
		contentPane.add(lblPesoNaTerra);
		
		textField = new JTextField();
		textField.setBounds(21, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelecionarOPlaneta = new JLabel("Selecionar o Planeta:");
		lblSelecionarOPlaneta.setBounds(21, 65, 152, 14);
		contentPane.add(lblSelecionarOPlaneta);
		
		JRadioButton rdbtnMercrio = new JRadioButton("Mercúrio", false);
		rdbtnMercrio.setBounds(21, 98, 109, 23);
		contentPane.add(rdbtnMercrio);
		
		JRadioButton rdbtnVnus = new JRadioButton("V\u00E9nus", false);
		rdbtnVnus.setBounds(21, 129, 109, 23);
		contentPane.add(rdbtnVnus);
		
		JRadioButton rdbtnMarte = new JRadioButton("Marte", false);
		rdbtnMarte.setBounds(132, 98, 109, 23);
		contentPane.add(rdbtnMarte);
		
		JRadioButton rdbtnJpter = new JRadioButton("J\u00FApter", false);
		rdbtnJpter.setBounds(132, 129, 109, 23);
		contentPane.add(rdbtnJpter);
		
		JRadioButton rdbtnSaturno = new JRadioButton("Saturno", false);
		rdbtnSaturno.setBounds(260, 98, 109, 23);
		contentPane.add(rdbtnSaturno);
		
		JRadioButton rdbtnUranio = new JRadioButton("Uranio", false);
		rdbtnUranio.setBounds(260, 129, 109, 23);
		contentPane.add(rdbtnUranio);
		
		JButton btnCalcularPeso = new JButton("Calcular Peso");
		btnCalcularPeso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double mer = 0.37;
				double ven = 0.88;
				double mar = 0.38;
				double jup = 2.04;
				double sat = 1.15;
				double ura = 1.17;
				double conv = 0.00;
				double resul = 0.00;
				conv = Double.parseDouble(textField.getText()) ;

				if(rdbtnMercrio.isSelected()== true) {
					resul = (conv / 10.00) * mer;
					JOptionPane.showMessageDialog(null, "O seu peso em Mercúrio é: " + resul);
				}						
				if(rdbtnVnus.isSelected()== true) {
					resul = (conv / 10.00) * ven;
					JOptionPane.showMessageDialog(null, "O seu peso em Venús é: " + resul);	
				}
				if(rdbtnMarte.isSelected()== true) {
					resul = (conv / 10.00) * mar;
					JOptionPane.showMessageDialog(null, "O seu peso em Marte é: " +resul);	
				}
				if(rdbtnJpter.isSelected()== true) {
					resul = (conv / 10) * jup;
					JOptionPane.showMessageDialog(null, "O seu peso em Jupter é: " + resul);
				}
				if(rdbtnSaturno.isSelected()== true) {
					resul = (conv / 10.00) * sat;
					JOptionPane.showMessageDialog(null,"O seu peso em Saturno é: " + resul);
				}
				if(rdbtnUranio.isSelected()== true) {
					resul = (conv / 10.00) * ura;
					JOptionPane.showMessageDialog(null, "O seu peso em Uranio é: " + resul);
				}
			}
		});
		btnCalcularPeso.setBounds(211, 33, 142, 23);
		contentPane.add(btnCalcularPeso);
	}
}
