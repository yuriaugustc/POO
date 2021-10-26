package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField TUsuario;
	private JTextField TSenha;

	public JLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login no Sistema");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblLogin.setBounds(109, 11, 195, 39);
		desktopPane.add(lblLogin);
		
		JLabel lblEstaUma = new JLabel("Esta \u00E9 uma area apenas para funcion\u00E1rios, se voc\u00EA n\u00E3o \u00E9");
		lblEstaUma.setForeground(Color.RED);
		lblEstaUma.setToolTipText("");
		lblEstaUma.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		lblEstaUma.setBounds(10, 45, 404, 19);
		desktopPane.add(lblEstaUma);
		
		JLabel lblSeVocNo = new JLabel(" funcion\u00E1rio, por favor retorne ao menu anterior.");
		lblSeVocNo.setForeground(Color.RED);
		lblSeVocNo.setToolTipText("");
		lblSeVocNo.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		lblSeVocNo.setBounds(10, 61, 334, 19);
		desktopPane.add(lblSeVocNo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setToolTipText("");
		lblUsuario.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		lblUsuario.setBounds(10, 91, 67, 19);
		desktopPane.add(lblUsuario);
		
		TUsuario = new JTextField();
		TUsuario.setBounds(92, 91, 252, 19);
		desktopPane.add(TUsuario);
		TUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setToolTipText("");
		lblSenha.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		lblSenha.setBounds(10, 121, 67, 19);
		desktopPane.add(lblSenha);
		
		TSenha = new JTextField();
		TSenha.setColumns(10);
		TSenha.setBounds(92, 121, 252, 19);
		desktopPane.add(TSenha);
		
		JButton btnAvancar = new JButton("Avancar");
		btnAvancar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnAvancar.setBounds(318, 159, 96, 29);
		desktopPane.add(btnAvancar);
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = TUsuario.getText();
				String password = TSenha.getText();
				if(user.length() == 0 || password.length() == 0) {
					JOptionPane.showMessageDialog(null, "Insira um usuario ou Senha valida!", "Usuario ou Senha invalida", JOptionPane.ERROR_MESSAGE, null);
				}
			}
			
		});
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnRetornar.setBounds(10, 159, 96, 29);
		desktopPane.add(btnRetornar);
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
