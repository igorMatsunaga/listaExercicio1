package triangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class teste extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
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
	public teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLado = new JLabel("Lado 1");
		lblLado.setBounds(31, 42, 46, 14);
		contentPane.add(lblLado);
		
		JLabel lblLado_1 = new JLabel("Lado 2");
		lblLado_1.setBounds(31, 78, 46, 14);
		contentPane.add(lblLado_1);
		
		JLabel lblLado_2 = new JLabel("Lado 3");
		lblLado_2.setBounds(31, 115, 46, 14);
		contentPane.add(lblLado_2);
		
		textField = new JTextField();
		textField.setBounds(87, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 112, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(232, 78, 150, 14);
		contentPane.add(label);
		
		JButton btnVerificarTriangulo = new JButton("Verificar Triangulo");
		btnVerificarTriangulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String lado1 = textField.getText();
                String lado2 = textField_1.getText();
                String lado3 = textField_2.getText();
                
                if (lado1.equals(lado2) && lado1.equals(lado3)){     
                    label.setText("Triângulo Equilátero");
                }else if( (lado1.equals(lado2) || lado1.equals(lado3)) || (lado2.equals(lado3))){
                    label.setText("Triângulo Isósceles");
                }else
                    label.setText("Triângulo Escaleno");
			}
		});
		btnVerificarTriangulo.setBounds(122, 149, 156, 23);
		contentPane.add(btnVerificarTriangulo);
	}

}
