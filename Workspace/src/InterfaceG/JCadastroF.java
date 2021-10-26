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
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;

public class JCadastroF extends JFrame {

	private JPanel contentPane;
	private JTextField TNomeCompleto;
	private JTextField Tcpf;
	private JTextField TDataNascimento;
	private JTextField TSexo;
	private JTextField TRG;
	private JTextField TEstado_civil;
	private JTextField TRua;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;
	private JTextField TNumero;
	private JTextField TCargo;
	private JTextField TAdmissao;
	private JTextField TSalario;
	private JTextField TMatricula;
	private JTextField TLogin;
	private JPasswordField PSenha;

	public JCadastroF() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 504, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JLabel lblAreaCadastro = new JLabel("Area de Cadastro");
		lblAreaCadastro.setBounds(158, 11, 150, 36);
		lblAreaCadastro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		desktopPane.add(lblAreaCadastro);
		
		JLabel lblIndicacao = new JLabel("Preencha corretamente a seguir os seguintes atributos:");
		lblIndicacao.setBounds(10, 48, 307, 23);
		lblIndicacao.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		desktopPane.add(lblIndicacao);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setBounds(10, 77, 96, 25);
		lblNome.setFont(new Font("Bookman Old Style", Font.ITALIC, 12));
		desktopPane.add(lblNome);
		
		TNomeCompleto = new JTextField();
		TNomeCompleto.setBounds(115, 77, 353, 23);
		desktopPane.add(TNomeCompleto);
		TNomeCompleto.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF \r\n(utilize apenas numeros):");
		lblCPF.setBounds(10, 102, 155, 25);
		lblCPF.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblCPF);
		
		Tcpf = new JTextField();
		Tcpf.setBounds(168, 103, 114, 23);
		Tcpf.setColumns(10);
		desktopPane.add(Tcpf);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento (dd/mm/aaaa):");
		lblDataNascimento.setBounds(10, 127, 190, 25);
		lblDataNascimento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblDataNascimento);
		
		TDataNascimento = new JTextField();
		TDataNascimento.setBounds(209, 127, 130, 23);
		TDataNascimento.setColumns(10);
		desktopPane.add(TDataNascimento);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setBounds(292, 102, 24, 25);
		lblRG.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblRG);
		
		TRG = new JTextField();
		TRG.setBounds(318, 103, 150, 23);
		TRG.setColumns(10);
		desktopPane.add(TRG);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(9, 152, 31, 25);
		lblSexo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblSexo);
		
		TSexo = new JTextField();
		TSexo.setBounds(50, 153, 114, 23);
		TSexo.setColumns(10);
		desktopPane.add(TSexo);
		
		JLabel lblEstado_civil = new JLabel("Estado Civil:");
		lblEstado_civil.setBounds(171, 152, 73, 25);
		lblEstado_civil.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblEstado_civil);
		
		TEstado_civil = new JTextField();
		TEstado_civil.setBounds(243, 153, 225, 23);
		TEstado_civil.setColumns(10);
		desktopPane.add(TEstado_civil);
		
		JLabel lblEndereco = new JLabel("Insira abaixo o seu endereco de acordo com as lacunas:");
		lblEndereco.setBounds(10, 188, 329, 25);
		lblEndereco.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		desktopPane.add(lblEndereco);
		
		TRua = new JTextField();
		TRua.setBounds(37, 213, 259, 23);
		TRua.setColumns(10);
		desktopPane.add(TRua);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 212, 30, 25);
		lblRua.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblRua);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(10, 235, 79, 25);
		lblComplemento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblComplemento);
		
		TComplemento = new JTextField();
		TComplemento.setBounds(86, 236, 130, 23);
		TComplemento.setColumns(10);
		desktopPane.add(TComplemento);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(219, 235, 45, 25);
		lblBairro.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblBairro);
		
		TBairro = new JTextField();
		TBairro.setBounds(262, 236, 206, 23);
		TBairro.setColumns(10);
		desktopPane.add(TBairro);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(10, 258, 31, 25);
		lblCEP.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblCEP);
		
		TCEP = new JTextField();
		TCEP.setBounds(37, 259, 114, 23);
		TCEP.setColumns(10);
		desktopPane.add(TCEP);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(154, 258, 45, 25);
		lblCidade.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblCidade);
		
		TCidade = new JTextField();
		TCidade.setBounds(209, 259, 259, 23);
		TCidade.setColumns(10);
		desktopPane.add(TCidade);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(304, 212, 45, 25);
		lblNumero.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblNumero);
		
		TNumero = new JTextField();
		TNumero.setBounds(352, 213, 116, 23);
		TNumero.setColumns(10);
		desktopPane.add(TNumero);
		
		JLabel lblInsiraAbaixoOs = new JLabel("Insira abaixo os detalhes empresariais do funcion\u00E1rio:");
		lblInsiraAbaixoOs.setBounds(10, 289, 302, 16);
		lblInsiraAbaixoOs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		desktopPane.add(lblInsiraAbaixoOs);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 311, 38, 23);
		lblCargo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblCargo);
		
		TCargo = new JTextField();
		TCargo.setBounds(47, 311, 123, 23);
		TCargo.setColumns(10);
		desktopPane.add(TCargo);
		
		JLabel lblAdmissao = new JLabel("Admissao:");
		lblAdmissao.setBounds(172, 311, 54, 23);
		lblAdmissao.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		desktopPane.add(lblAdmissao);
		
		TAdmissao = new JTextField();
		TAdmissao.setBounds(230, 311, 96, 23);
		TAdmissao.setColumns(10);
		desktopPane.add(TAdmissao);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSalario.setBounds(329, 311, 45, 23);
		desktopPane.add(lblSalario);
		
		TSalario = new JTextField();
		TSalario.setColumns(10);
		TSalario.setBounds(372, 311, 96, 23);
		desktopPane.add(TSalario);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblMatricula.setBounds(10, 334, 54, 23);
		desktopPane.add(lblMatricula);
		
		TMatricula = new JTextField();
		TMatricula.setColumns(10);
		TMatricula.setBounds(69, 335, 96, 23);
		desktopPane.add(TMatricula);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblLogin.setBounds(171, 334, 45, 23);
		desktopPane.add(lblLogin);
		
		TLogin = new JTextField();
		TLogin.setColumns(10);
		TLogin.setBounds(209, 334, 96, 23);
		desktopPane.add(TLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSenha.setBounds(307, 334, 45, 23);
		desktopPane.add(lblSenha);
		
		PSenha = new JPasswordField();
		PSenha.setBounds(352, 334, 116, 23);
		desktopPane.add(PSenha);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setBounds(262, 368, 206, 23);
		btnConcluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		desktopPane.add(btnConcluir);
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
