package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class ventana3 extends JFrame  {

	JFileChooser fileChooser = new JFileChooser();
	int opcion = fileChooser.showOpenDialog(this);

	/**
	 * 
	 */
	private static final long serialVersionUID = 8658833826113910620L;
	private JLabel texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3 frame = new ventana3();
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
	public ventana3() {

		setTitle("selecccion de fichero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		texto = new JLabel("");
		texto.setBounds(10, 178, 400, 39);
		getContentPane().add(texto);

		if (opcion == JFileChooser.APPROVE_OPTION) {
			// si ha pulsado Aceptar
			texto.setText("Ha elegido el archivo " + fileChooser.getSelectedFile());
		} else if (opcion == JFileChooser.CANCEL_OPTION) {
			// si ha pulsado Cancelar
			texto.setText("Ha pulsado Cancelar");
		} else if (opcion == JFileChooser.ERROR_OPTION) {
			// si ha producido un Error
			texto.setText("Se ha producido un Error.");
		}

		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros de Texto", "txt");
		fileChooser.setFileFilter(filtro);

		fileChooser.setAcceptAllFileFilterUsed(false);

		filtro = new FileNameExtensionFilter("Documentos de Word", "doc");
		fileChooser.addChoosableFileFilter(filtro);

	}

	
}
