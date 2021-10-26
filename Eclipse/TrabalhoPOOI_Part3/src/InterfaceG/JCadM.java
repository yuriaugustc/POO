package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JCadM extends JFrame {

	private JPanel contentPane;
	private JTextField TCRM;

	public JCadM() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 318, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblTittle = new JLabel("Detalhes Medicos");
		lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTittle.setBounds(58, 11, 160, 35);
		desktopPane.add(lblTittle);
		
		JLabel lblNewLabel = new JLabel("Insira abaixo os detalhes medicos:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 45, 244, 29);
		desktopPane.add(lblNewLabel);
		
		JLabel lblCrm = new JLabel("CRM:");
		lblCrm.setFont(new Font("Bookman Old Style", Font.ITALIC, 13));
		lblCrm.setBounds(10, 85, 45, 23);
		desktopPane.add(lblCrm);
		
		TCRM = new JTextField();
		TCRM.setBounds(58, 87, 196, 23);
		desktopPane.add(TCRM);
		TCRM.setColumns(10);
		
		JLabel lblEspecialidades = new JLabel("Especialidades: ");
		lblEspecialidades.setFont(new Font("Bookman Old Style", Font.ITALIC, 13));
		lblEspecialidades.setBounds(10, 117, 113, 23);
		desktopPane.add(lblEspecialidades);
		
		JTextPane txtpnEspecialidades = new JTextPane();
		txtpnEspecialidades.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnEspecialidades.setForeground(Color.LIGHT_GRAY);
		txtpnEspecialidades.setText("Nome: Exemplo1\r\nDescri\u00E7\u00E3o: Exemplo1\r\nNome: Exemplo2\r\nDescri\u00E7\u00E3o: Exemplo2");
		txtpnEspecialidades.setBounds(10, 174, 272, 110);
		desktopPane.add(txtpnEspecialidades);
		
		JLabel lblObsSepareCada = new JLabel("OBS: Separe cada topico de especialidade por linha");
		lblObsSepareCada.setForeground(Color.RED);
		lblObsSepareCada.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblObsSepareCada.setBounds(10, 140, 272, 23);
		desktopPane.add(lblObsSepareCada);
		
		JButton btnAvancar = new JButton("Avancar");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastroF cadastro = new JCadastroF();
				cadastro.setVisible(true);
				cadastro.setLocationRelativeTo(null);
				cadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		btnAvancar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnAvancar.setBounds(169, 288, 113, 23);
		desktopPane.add(btnAvancar);
	}
}
