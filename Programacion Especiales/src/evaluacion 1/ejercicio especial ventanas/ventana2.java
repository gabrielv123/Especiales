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
import javax.swing.JTextArea;
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
import javax.swing.ImageIcon;

public class ventana2 extends JFrame implements ActionListener {

	private JMenuBar menuBar;
	private JMenu menu1;
	private JMenuItem menunew;
	private JMenuItem menuopen;
	private JMenuItem menuexit;
	private JMenu menucopiar;
	private JMenuItem menucopiarr;
	private JMenuItem menupegar;
	private JMenuItem menuhelp;
	private JMenuItem menuhelpp;
	private JMenu menu3;
	private JTextArea textArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8658833826113910620L;
	private JLabel texto;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 frame = new ventana2();
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
	public ventana2() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu1 = new JMenu("file");
		menuBar.add(menu1);

		menunew = new JMenuItem("new");
		menu1.add(menunew);

		menuopen = new JMenuItem("open");
		menu1.add(menuopen);
		menuopen.addActionListener(this);

		menuexit = new JMenuItem("exit");
		menu1.add(menuexit);
		menuexit.addActionListener(this);

		menucopiar = new JMenu("edit");
		menuBar.add(menucopiar);

		menucopiarr = new JMenuItem("copiar");
		menucopiarr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		menucopiar.add(menucopiarr);

		menupegar = new JMenuItem("pegar");
		menupegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		menucopiar.add(menupegar);

		menu3 = new JMenu("help");
		menuBar.add(menu3);

		menuhelp = new JMenuItem("more help");
		menuhelp.setIcon(new ImageIcon(ventana2.class.getResource("/windowsbuilder/icon/acercade.gif")));
		menu3.add(menuhelp);
		menuhelp.addActionListener(this);

		menuhelpp = new JMenuItem("help");
		menu3.add(menuhelpp);
		getContentPane().setLayout(null);
		menuhelpp.addActionListener(this);

		texto = new JLabel("");
		texto.setBounds(10, 178, 400, 39);
		getContentPane().add(texto);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object o = e.getSource();

		if (o == menuopen) {

			ventana3 vh = new ventana3();


			vh.setVisible(true);

			this.dispose();

		}

		if (o == menuexit) {

			System.exit(0);
		}

		if (o == menuhelp) {

			
			textArea_1 = new JTextArea();
			textArea_1.setBounds(240, 36, 171, 164);
			getContentPane().add(textArea_1);
		}

		if (o == menuhelpp) {

			ventana4 vh = new ventana4();


			vh.setVisible(true);

			this.dispose();

		}
	}
}
