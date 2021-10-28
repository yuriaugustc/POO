package InterfaceG;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.Consulta;
import TrabalhoPOOI.DadosConsulta;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class JAgendamento extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField TNomeCompleto;
	private JTextField TCPF;
	private JTextField TDataNascimento;
	private JTextField TRG;
	private JTextField TSexo;
	private JTextField TEstadoCivil;
	private JTextField TRua;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;
	private JTextField TNumero;
	private JTextField TNomeMedico;
	private JTextField TCRM;
	private JTextField TDataConsulta;
	private JTextField THoraConsulta;
	private JTextField TNomeFuncionario;
	private JTextField TMatricula;
	
	public static void main(String[] args) {
		JAgendamento jag = new JAgendamento();
		jag.setVisible(true);
	}

	public JAgendamento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 504, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JLabel lblCadastroDoPaciente = new JLabel("Cadastro do Paciente ao Agendamento");
		lblCadastroDoPaciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCadastroDoPaciente.setBounds(67, 11, 329, 36);
		desktopPane.add(lblCadastroDoPaciente);

		JLabel lblIndicacao = new JLabel("Preencha corretamente a seguir os seguintes atributos:");
		lblIndicacao.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblIndicacao.setBounds(11, 48, 307, 23);
		desktopPane.add(lblIndicacao);

		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setFont(new Font("Bookman Old Style", Font.ITALIC, 12));
		lblNome.setBounds(11, 77, 96, 25);
		desktopPane.add(lblNome);

		TNomeCompleto = new JTextField();
		TNomeCompleto.setColumns(10);
		TNomeCompleto.setBounds(116, 77, 353, 23);
		desktopPane.add(TNomeCompleto);

		JLabel lblCPF = new JLabel("CPF \r\n(utilize apenas numeros):");
		lblCPF.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCPF.setBounds(11, 102, 155, 25);
		desktopPane.add(lblCPF);

		TCPF = new JTextField();
		TCPF.setColumns(10);
		TCPF.setBounds(169, 103, 114, 23);
		desktopPane.add(TCPF);

		JLabel lblDataNascimento = new JLabel("Data de Nascimento (dd/mm/aaaa):");
		lblDataNascimento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDataNascimento.setBounds(11, 127, 190, 25);
		desktopPane.add(lblDataNascimento);

		TDataNascimento = new JTextField();
		TDataNascimento.setColumns(10);
		TDataNascimento.setBounds(210, 127, 130, 23);
		desktopPane.add(TDataNascimento);

		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRG.setBounds(293, 102, 24, 25);
		desktopPane.add(lblRG);

		TRG = new JTextField();
		TRG.setColumns(10);
		TRG.setBounds(319, 103, 150, 23);
		desktopPane.add(TRG);

		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSexo.setBounds(10, 152, 31, 25);
		desktopPane.add(lblSexo);

		TSexo = new JTextField();
		TSexo.setColumns(10);
		TSexo.setBounds(51, 153, 114, 23);
		desktopPane.add(TSexo);

		JLabel lblEstado_civil = new JLabel("Estado Civil:");
		lblEstado_civil.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblEstado_civil.setBounds(172, 152, 73, 25);
		desktopPane.add(lblEstado_civil);

		TEstadoCivil = new JTextField();
		TEstadoCivil.setColumns(10);
		TEstadoCivil.setBounds(244, 153, 225, 23);
		desktopPane.add(TEstadoCivil);

		JLabel lblEndereco = new JLabel("Insira abaixo o seu endereco de acordo com as lacunas:");
		lblEndereco.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEndereco.setBounds(11, 188, 329, 25);
		desktopPane.add(lblEndereco);

		TRua = new JTextField();
		TRua.setColumns(10);
		TRua.setBounds(38, 213, 259, 23);
		desktopPane.add(TRua);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRua.setBounds(11, 212, 30, 25);
		desktopPane.add(lblRua);

		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblComplemento.setBounds(11, 235, 79, 25);
		desktopPane.add(lblComplemento);

		TComplemento = new JTextField();
		TComplemento.setColumns(10);
		TComplemento.setBounds(87, 236, 130, 23);
		desktopPane.add(TComplemento);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblBairro.setBounds(220, 235, 45, 25);
		desktopPane.add(lblBairro);

		TBairro = new JTextField();
		TBairro.setColumns(10);
		TBairro.setBounds(263, 236, 206, 23);
		desktopPane.add(TBairro);

		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCEP.setBounds(11, 258, 31, 25);
		desktopPane.add(lblCEP);

		TCEP = new JTextField();
		TCEP.setColumns(10);
		TCEP.setBounds(38, 259, 114, 23);
		desktopPane.add(TCEP);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCidade.setBounds(155, 258, 45, 25);
		desktopPane.add(lblCidade);

		TCidade = new JTextField();
		TCidade.setColumns(10);
		TCidade.setBounds(210, 259, 259, 23);
		desktopPane.add(TCidade);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNumero.setBounds(305, 212, 45, 25);
		desktopPane.add(lblNumero);

		TNumero = new JTextField();
		TNumero.setColumns(10);
		TNumero.setBounds(353, 213, 116, 23);
		desktopPane.add(TNumero);

		JLabel lblPossuiUmPlano = new JLabel("Possui um Plano de Saude?");
		lblPossuiUmPlano.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblPossuiUmPlano.setBounds(11, 283, 150, 25);
		desktopPane.add(lblPossuiUmPlano);

		JRadioButton rdbtnSim = new JRadioButton("Sim", false);
		rdbtnSim.setForeground(Color.BLACK);
		rdbtnSim.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		rdbtnSim.setBackground(Color.WHITE);
		rdbtnSim.setBounds(159, 284, 45, 23);
		desktopPane.add(rdbtnSim);

		JRadioButton rdbtnNao = new JRadioButton("Nao", false);
		rdbtnNao.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		rdbtnNao.setBackground(Color.WHITE);
		rdbtnNao.setBounds(210, 284, 45, 23);
		desktopPane.add(rdbtnNao);

		ButtonGroup bg = new ButtonGroup(); // adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa
											// ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);

		JButton btnAvancar = new JButton("Avancar");
		btnAvancar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnAvancar.setBounds(263, 410, 206, 23);
		desktopPane.add(btnAvancar);
		
		JLabel lblInsiraAbaixoAs = new JLabel("Insira abaixo as informa\u00E7\u00F5es do Funcionarios envolvidos nesta Consulta");
		lblInsiraAbaixoAs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblInsiraAbaixoAs.setBounds(11, 314, 408, 25);
		desktopPane.add(lblInsiraAbaixoAs);
		
		JLabel lblNomeDoMedico = new JLabel("Nome do Medico que atendera o paciente");
		lblNomeDoMedico.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNomeDoMedico.setBounds(10, 337, 217, 25);
		desktopPane.add(lblNomeDoMedico);
		
		TNomeMedico = new JTextField();
		TNomeMedico.setColumns(10);
		TNomeMedico.setBounds(227, 337, 242, 23);
		desktopPane.add(TNomeMedico);
		
		JLabel lblCrmDoMedico = new JLabel("CRM do Medico");
		lblCrmDoMedico.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCrmDoMedico.setBounds(11, 360, 96, 25);
		desktopPane.add(lblCrmDoMedico);
		
		TCRM = new JTextField();
		TCRM.setColumns(10);
		TCRM.setBounds(97, 360, 104, 23);
		desktopPane.add(TCRM);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblData.setBounds(208, 360, 37, 25);
		desktopPane.add(lblData);
		
		TDataConsulta = new JTextField();
		TDataConsulta.setColumns(10);
		TDataConsulta.setBounds(244, 360, 87, 23);
		desktopPane.add(TDataConsulta);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblHora.setBounds(336, 360, 37, 25);
		desktopPane.add(lblHora);
		
		THoraConsulta = new JTextField();
		THoraConsulta.setColumns(10);
		THoraConsulta.setBounds(373, 360, 96, 23);
		desktopPane.add(THoraConsulta);
		
		JLabel lblNomeDoFuncionario = new JLabel("Nome do Funcionario que realizou o cadastro:");
		lblNomeDoFuncionario.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNomeDoFuncionario.setBounds(11, 383, 234, 25);
		desktopPane.add(lblNomeDoFuncionario);
		
		TNomeFuncionario = new JTextField();
		TNomeFuncionario.setColumns(10);
		TNomeFuncionario.setBounds(254, 383, 215, 23);
		desktopPane.add(TNomeFuncionario);
		
		TMatricula = new JTextField();
		TMatricula.setColumns(10);
		TMatricula.setBounds(149, 410, 104, 23);
		desktopPane.add(TMatricula);
		
		JLabel lblMatriculaDoFuncionario = new JLabel("Matricula do Funcionario:");
		lblMatriculaDoFuncionario.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblMatriculaDoFuncionario.setBounds(11, 410, 141, 25);
		desktopPane.add(lblMatriculaDoFuncionario);
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta con = new Consulta();
				int vlr = Integer.parseInt(TNumero.getText());
				con.setPaciente(TNomeCompleto.getText(), TDataNascimento.getText(), TSexo.getText(), TCPF.getText(), TRG.getText(), TEstadoCivil.getText(), TRua.getText(), vlr, TComplemento.getText(), TBairro.getText(), TCEP.getText(), TCidade.getText());
				con.setMedico(TNomeMedico.getText(), TCRM.getText());
				con.setFuncionario(TNomeFuncionario.getText(), Integer.parseInt(TMatricula.getText()));
				DadosConsulta.cadastra(con);
				if (rdbtnSim.isSelected()) {
					JCadPSTAG plano = new JCadPSTAG(TCPF.getText());
					plano.setVisible(true);
					plano.setLocationRelativeTo(null);
					plano.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				} else if (rdbtnNao.isSelected()) {
					JCadPSFAG plano = new JCadPSFAG(TCPF.getText());
					plano.setVisible(true);
					plano.setLocationRelativeTo(null);
					plano.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
			}
		});
	}
}
