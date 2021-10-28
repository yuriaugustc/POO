package InterfaceG;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.DadosFuncionarios;
import TrabalhoPOOI.Funcionario;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;

public class JConsultaF extends JFrame {

	private JPanel contentPane;
	private JTextField TPesquisa;
	private JTextField TNome;
	private JTextField TCPF;
	private JTextField TRG;
	private JTextField TDataNascimento;
	private JTextField TSexo;
	private JTextField TEstadoCivil;
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

	public JConsultaF() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JLabel lblTittle = new JLabel("Consulta de Funcionario");
		lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTittle.setBounds(98, 11, 215, 25);
		desktopPane.add(lblTittle);

		JLabel lblOrientacao = new JLabel("Insira por gentileza a Matricula do Funcionario que deseja buscar:");
		lblOrientacao.setFont(new Font("Bookman Old Style", Font.ITALIC, 12));
		lblOrientacao.setBounds(10, 33, 404, 19);
		desktopPane.add(lblOrientacao);

		TPesquisa = new JTextField();
		TPesquisa.setColumns(10);
		TPesquisa.setBounds(10, 54, 294, 24);
		desktopPane.add(TPesquisa);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		btnPesquisar.setBounds(314, 55, 100, 23);
		desktopPane.add(btnPesquisar);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario func;
				func = DadosFuncionarios.buscar(TPesquisa.getText());
				TNome.setText(func.getNome());
				TCPF.setText(func.getCPF());
				TRG.setText(func.getRG());
				TDataNascimento.setText(func.getData_nascimento());
				TSexo.setText(func.getSexo());
				TEstadoCivil.setText(func.getEstado_civil());
				TRua.setText(func.getEnd().getRua());
				TNumero.setText(Integer.toString(func.getEnd().getNro()));
				TComplemento.setText(func.getEnd().getComplemento());
				TBairro.setText(func.getEnd().getBairro());
				TCEP.setText(func.getEnd().getCep());
				TCidade.setText(func.getEnd().getCidade());
				TCargo.setText(func.getCargo());
				TAdmissao.setText(func.getData_admissao());
				TSalario.setText(Double.toString(func.getSalario()));
				TMatricula.setText(Integer.toString(func.getMatricula()));
				TLogin.setText(func.getLogin());
			}
		});

		JLabel lblInformacoesDoPaciente = new JLabel("Informacoes do Funcionario:");
		lblInformacoesDoPaciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblInformacoesDoPaciente.setBounds(10, 80, 167, 25);
		desktopPane.add(lblInformacoesDoPaciente);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNome.setBounds(10, 113, 50, 24);
		desktopPane.add(lblNome);

		TNome = new JTextField();
		TNome.setEditable(false);
		TNome.setColumns(10);
		TNome.setBounds(62, 113, 352, 24);
		desktopPane.add(TNome);

		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCpf.setBounds(10, 138, 50, 24);
		desktopPane.add(lblCpf);

		TCPF = new JTextField();
		TCPF.setEnabled(false);
		TCPF.setColumns(10);
		TCPF.setBounds(62, 138, 156, 24);
		desktopPane.add(TCPF);

		JLabel lblRg = new JLabel("RG: ");
		lblRg.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRg.setBounds(220, 138, 34, 24);
		desktopPane.add(lblRg);

		TRG = new JTextField();
		TRG.setEditable(false);
		TRG.setColumns(10);
		TRG.setBounds(251, 138, 163, 24);
		desktopPane.add(TRG);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDataDeNascimento.setBounds(10, 163, 116, 25);
		desktopPane.add(lblDataDeNascimento);

		TDataNascimento = new JTextField();
		TDataNascimento.setEditable(false);
		TDataNascimento.setColumns(10);
		TDataNascimento.setBounds(124, 164, 130, 23);
		desktopPane.add(TDataNascimento);

		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSexo.setBounds(261, 163, 31, 25);
		desktopPane.add(lblSexo);

		TSexo = new JTextField();
		TSexo.setEditable(false);
		TSexo.setColumns(10);
		TSexo.setBounds(291, 164, 123, 23);
		desktopPane.add(TSexo);

		JLabel lblEstado_civil = new JLabel("Estado Civil: ");
		lblEstado_civil.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblEstado_civil.setBounds(10, 188, 73, 25);
		desktopPane.add(lblEstado_civil);

		TEstadoCivil = new JTextField();
		TEstadoCivil.setEditable(false);
		TEstadoCivil.setColumns(10);
		TEstadoCivil.setBounds(78, 189, 150, 23);
		desktopPane.add(TEstadoCivil);

		JLabel lblEndereco = new JLabel("Endereco: ");
		lblEndereco.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEndereco.setBounds(10, 211, 65, 25);
		desktopPane.add(lblEndereco);

		TRua = new JTextField();
		TRua.setEditable(false);
		TRua.setColumns(10);
		TRua.setBounds(37, 237, 259, 23);
		desktopPane.add(TRua);

		JLabel lblRua = new JLabel("Rua: ");
		lblRua.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRua.setBounds(10, 236, 30, 25);
		desktopPane.add(lblRua);

		JLabel lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblComplemento.setBounds(10, 259, 79, 25);
		desktopPane.add(lblComplemento);

		TComplemento = new JTextField();
		TComplemento.setEditable(false);
		TComplemento.setColumns(10);
		TComplemento.setBounds(86, 260, 130, 23);
		desktopPane.add(TComplemento);

		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblBairro.setBounds(219, 259, 45, 25);
		desktopPane.add(lblBairro);

		TBairro = new JTextField();
		TBairro.setColumns(10);
		TBairro.setBounds(261, 260, 153, 23);
		desktopPane.add(TBairro);

		JLabel lblCEP = new JLabel("CEP: ");
		lblCEP.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCEP.setBounds(10, 282, 31, 25);
		desktopPane.add(lblCEP);

		TCEP = new JTextField();
		TCEP.setEditable(false);
		TCEP.setColumns(10);
		TCEP.setBounds(37, 283, 114, 23);
		desktopPane.add(TCEP);

		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCidade.setBounds(154, 282, 45, 25);
		desktopPane.add(lblCidade);

		TCidade = new JTextField();
		TCidade.setEditable(false);
		TCidade.setColumns(10);
		TCidade.setBounds(199, 283, 215, 23);
		desktopPane.add(TCidade);

		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNumero.setBounds(304, 236, 45, 25);
		desktopPane.add(lblNumero);

		TNumero = new JTextField();
		TNumero.setEditable(false);
		TNumero.setColumns(10);
		TNumero.setBounds(353, 237, 61, 23);
		desktopPane.add(TNumero);

		JLabel lblInformaesEmpresariais = new JLabel("Informa\u00E7\u00F5es Empresariais: ");
		lblInformaesEmpresariais.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblInformaesEmpresariais.setBounds(10, 313, 156, 25);
		desktopPane.add(lblInformaesEmpresariais);

		JLabel lblCargo = new JLabel("Cargo: ");
		lblCargo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCargo.setBounds(10, 349, 38, 23);
		desktopPane.add(lblCargo);

		TCargo = new JTextField();
		TCargo.setEditable(false);
		TCargo.setColumns(10);
		TCargo.setBounds(43, 349, 116, 23);
		desktopPane.add(TCargo);

		JLabel lblAdmissao = new JLabel("Admissao: ");
		lblAdmissao.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblAdmissao.setBounds(164, 349, 64, 23);
		desktopPane.add(lblAdmissao);

		TAdmissao = new JTextField();
		TAdmissao.setEditable(false);
		TAdmissao.setColumns(10);
		TAdmissao.setBounds(227, 349, 79, 23);
		desktopPane.add(TAdmissao);

		JLabel lblSalario = new JLabel("Salario: ");
		lblSalario.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSalario.setBounds(314, 349, 45, 23);
		desktopPane.add(lblSalario);

		TSalario = new JTextField();
		TSalario.setEditable(false);
		TSalario.setColumns(10);
		TSalario.setBounds(353, 349, 61, 23);
		desktopPane.add(TSalario);

		JLabel lblMatricula = new JLabel("Matricula: ");
		lblMatricula.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblMatricula.setBounds(10, 373, 54, 23);
		desktopPane.add(lblMatricula);

		TMatricula = new JTextField();
		TMatricula.setEditable(false);
		TMatricula.setColumns(10);
		TMatricula.setBounds(70, 373, 96, 23);
		desktopPane.add(TMatricula);

		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblLogin.setBounds(173, 373, 45, 23);
		desktopPane.add(lblLogin);

		TLogin = new JTextField();
		TLogin.setEditable(false);
		TLogin.setColumns(10);
		TLogin.setBounds(210, 373, 96, 23);
		desktopPane.add(TLogin);

		JLabel lblDesejaExcluirEste = new JLabel("Deseja excluir este Funcionario? ");
		lblDesejaExcluirEste.setForeground(Color.RED);
		lblDesejaExcluirEste.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDesejaExcluirEste.setBounds(10, 402, 167, 25);
		desktopPane.add(lblDesejaExcluirEste);

		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnSim.setBounds(183, 403, 45, 23);
		desktopPane.add(rdbtnSim);

		JRadioButton rdbtnNao = new JRadioButton("Nao");
		rdbtnNao.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnNao.setBounds(230, 403, 45, 23);
		desktopPane.add(rdbtnNao);

		ButtonGroup bg = new ButtonGroup(); // adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa
											// ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);

		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnConcluir.setBounds(281, 397, 133, 30);
		desktopPane.add(btnConcluir);
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNao.isSelected()) {
					dispose();
				} else if (rdbtnSim.isSelected()) {
					DadosFuncionarios.remove(TPesquisa.getText());
					JOptionPane.showMessageDialog(null, "O Funcionario foi apagado do sistema!");
					dispose();
				}
			}
		});

	}

}
