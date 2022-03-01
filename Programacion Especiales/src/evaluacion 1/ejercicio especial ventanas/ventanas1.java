package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class ventanas1 extends JFrame implements ActionListener {

	private JLabel tnombre;
	private JLabel tcontraseña;
	private JButton botonaceptar;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3859674341995602086L;
	private JPanel contentPane;
	private JTextField fnombre;
	private JPasswordField contraseña;
	private JLabel texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanas1 frame = new ventanas1();
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
	public ventanas1() {

		JOptionPane.showMessageDialog(this, (String) "bienvenido a nuestro sitio web", "welcome",
				JOptionPane.INFORMATION_MESSAGE, null);

		setTitle("identificate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tnombre = new JLabel("nombre");
		tnombre.setBounds(50, 77, 46, 14);
		contentPane.add(tnombre);

		tcontraseña = new JLabel("apellido");
		tcontraseña.setBounds(50, 130, 46, 14);
		contentPane.add(tcontraseña);

		fnombre = new JTextField();
		fnombre.setBounds(128, 74, 214, 20);
		contentPane.add(fnombre);
		fnombre.setColumns(10);

		botonaceptar = new JButton("aceptar");
		botonaceptar.setBounds(179, 183, 89, 23);
		contentPane.add(botonaceptar);
		botonaceptar.addActionListener(this);

		contraseña = new JPasswordField();
		contraseña.setBounds(128, 127, 214, 20);
		contentPane.add(contraseña);
		
		texto = new JLabel("");
		texto.setBounds(22, 236, 354, 14);
		contentPane.add(texto);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object o = e.getSource();

		if (o == botonaceptar) {
			
			

		}

		String password= contraseña.getText();
		
		if (password.equalsIgnoreCase("abc")) {
			
			 ventana2 vh = new ventana2();
		
			 vh.setTitle("Bienvenido "+fnombre.getText());
		
			 vh.setVisible(true);
			 
			 this.dispose();

		}
		
		else {
			
			texto.setText("la contraseña no es correcta");
			
		}

	}
}
