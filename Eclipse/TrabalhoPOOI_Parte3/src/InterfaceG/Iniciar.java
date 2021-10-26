package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Iniciar extends JFrame {

	private JPanel contentPane;
	 // Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iniciar frame = new Iniciar();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}
	 // Create the frame.
	public Iniciar() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel tittle = new JLabel("Bem Vindo!");
		tittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		tittle.setBounds(147, 11, 125, 25);
		desktopPane.add(tittle);
		
		JLabel selecao = new JLabel("O que deseja fazer?");
		selecao.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		selecao.setBounds(147, 47, 118, 25);
		desktopPane.add(selecao);
		
		JButton cadastro = new JButton("Cadastro");
		cadastro.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JEscolha cadastro = new JEscolha("Cadastro");
				cadastro.setLocationRelativeTo(null);
				cadastro.setVisible(true);
				cadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		cadastro.setBounds(27, 90, 151, 39);
		desktopPane.add(cadastro);
		
		JButton consulta = new JButton("Consulta");
		consulta.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JEscolha consulta = new JEscolha("Consulta");
				consulta.setLocationRelativeTo(null);
				consulta.setVisible(true);
				consulta.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		consulta.setBounds(27, 140, 151, 39);
		desktopPane.add(consulta);
		
		JButton login = new JButton("Login no Sistema");
		login.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		login.setBounds(228, 90, 151, 39);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLogin login = new JLogin();
				login.setVisible(true);
				login.setLocationRelativeTo(null);
				login.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		desktopPane.add(login);
		
		JButton remove = new JButton("Exclusao");
		remove.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		remove.setBounds(228, 140, 151, 39);
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JEscolha exclusao = new JEscolha("Exclusao");
				exclusao.setVisible(true);
				exclusao.setLocationRelativeTo(null);
				exclusao.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		desktopPane.add(remove);
	}
}
