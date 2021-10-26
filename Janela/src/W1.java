import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class W1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id_p_formatar;
	private JTextField id_formatado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					W1 frame = new W1();
					frame.setLocationRelativeTo(null);
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
	public W1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		
		id_p_formatar = new JTextField();
		id_p_formatar.setBounds(10, 61, 382, 28);
		desktopPane.add(id_p_formatar);
		id_p_formatar.setColumns(10);
		
		JLabel Informacao = new JLabel("Insira aqui a sequencia de id's a serem formatados:");
		Informacao.setFont(new Font("Consolas", Font.BOLD, 14));
		Informacao.setBounds(10, 22, 464, 28);
		desktopPane.add(Informacao);
		
		JButton OK = new JButton("Formatar");
		OK.setFont(new Font("Consolas", Font.BOLD, 14));
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = id_p_formatar.getText();
				String idf = ids.replace(" ", ",");
				id_formatado.setText(idf);
			}
		});
		OK.setBounds(402, 62, 141, 28);
		desktopPane.add(OK);
		
		JButton finish = new JButton("Fechar");
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		finish.setFont(new Font("Consolas", Font.BOLD, 14));
		finish.setBounds(402, 147, 141, 28);
		desktopPane.add(finish);
		
		id_formatado = new JTextField();
		id_formatado.setColumns(10);
		id_formatado.setBounds(10, 146, 382, 28);
		desktopPane.add(id_formatado);
		
		JLabel Information = new JLabel("Aqui esta a sequencia de id's formatados:");
		Information.setFont(new Font("Consolas", Font.BOLD, 14));
		Information.setBounds(10, 100, 464, 28);
		desktopPane.add(Information);
	}
}
