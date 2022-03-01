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
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.DropMode;

public class ventana4 extends JFrame implements ActionListener {

	private JLabel textonombre;
	private JLabel textoemail;
	private JLabel textoedad;
	private JLabel texto4;
	private JButton botonenviar;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5254426346768996182L;
	private JPanel contentPane;
	private JTextField fnombre;
	private JTextField femail;
	private JTextField fedad;
	private JTextArea textArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4 frame = new ventana4();
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
	public ventana4() {
		setTitle("Consulta de informacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textonombre = new JLabel("nombre");
		textonombre.setBounds(21, 86, 46, 14);
		contentPane.add(textonombre);
		
		textoemail = new JLabel("email");
		textoemail.setBounds(21, 127, 46, 14);
		contentPane.add(textoemail);
		
		textoedad = new JLabel("edad");
		textoedad.setBounds(21, 165, 46, 14);
		contentPane.add(textoedad);
		
		fnombre = new JTextField();
		fnombre.setBounds(104, 83, 86, 20);
		contentPane.add(fnombre);
		fnombre.setColumns(10);
		
		femail = new JTextField();
		femail.setBounds(104, 124, 86, 20);
		contentPane.add(femail);
		femail.setColumns(10);
		
		fedad = new JTextField();
		fedad.setBounds(104, 162, 86, 20);
		contentPane.add(fedad);
		fedad.setColumns(10);
		
		texto4 = new JLabel("escribe tu consulta");
		texto4.setBounds(270, 21, 142, 14);
		contentPane.add(texto4);
		
		botonenviar = new JButton("enviar");
		botonenviar.setBounds(169, 227, 89, 23);
		contentPane.add(botonenviar);
		botonenviar.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(233, 58, 165, 146);
		contentPane.add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();

		
		
		String edad= fedad.getText();
		int edad1 = Integer.parseInt(edad);
		
		if (o == botonenviar && edad1<18) {
			
			JOptionPane.showMessageDialog(this, (String)  "debe ser mayor a 18","atencion",
					JOptionPane.WARNING_MESSAGE, null);
			
			
		}
		
		else {
			

			JOptionPane.showMessageDialog(this, (String)  "en breve recibira la respuesta","respuesta correcta",
					JOptionPane.INFORMATION_MESSAGE, null);
			
			//System.exit(0);
		}
		
	}
}

