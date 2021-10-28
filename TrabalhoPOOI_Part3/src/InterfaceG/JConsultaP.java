package InterfaceG;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.DadosPacComPlano;
import TrabalhoPOOI.DadosPacSemPlano;
import TrabalhoPOOI.PacienteComPlano;
import TrabalhoPOOI.PacienteSemPlano;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Color;

public class JConsultaP extends JFrame {

	private JPanel contentPane;
	private JTextField TCPF;
	private JTextField TNome;
	private JTextField TCPF1;
	private JTextField TRG;
	private JTextField TNascimento;
	private JTextField TSexo;
	private JTextField TEstadoCivil;
	private JTextField TRua;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;
	private JTextField TNumero;
	private JTextField TPlanoDeSaude;

	public JConsultaP() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);

		JLabel lblTittle = new JLabel("Consulta de Paciente");
		lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTittle.setBounds(118, 11, 188, 25);
		desktopPane.add(lblTittle);

		JLabel lblOrientacao = new JLabel("Insira por gentileza o CPF do Paciente que deseja buscar:");
		lblOrientacao.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		lblOrientacao.setBounds(10, 33, 404, 19);
		desktopPane.add(lblOrientacao);

		TCPF = new JTextField();
		TCPF.setBounds(10, 54, 294, 24);
		desktopPane.add(TCPF);
		TCPF.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		btnPesquisar.setBounds(314, 55, 100, 23);
		desktopPane.add(btnPesquisar);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PacienteComPlano pac = new PacienteComPlano();
				PacienteSemPlano pac1 = new PacienteSemPlano();
				pac = DadosPacComPlano.search(TCPF.getText());
				pac1 = DadosPacSemPlano.search(TCPF.getText());
				if(pac == null) {
				TNome.setText(pac1.getNome());
				TCPF.setText(pac1.getCPF());
				TRG.setText(pac1.getRG());
				TNascimento.setText(pac1.getData_nascimento());
				TSexo.setText(pac1.getSexo());
				TEstadoCivil.setText(pac1.getEstado_civil());
				TRua.setText(pac1.getEnd().getRua());
				TNumero.setText(Integer.toString(pac1.getEnd().getNro()));
				TComplemento.setText(pac1.getEnd().getComplemento());
				TBairro.setText(pac1.getEnd().getBairro());
				TCEP.setText(pac1.getEnd().getCep());
				TCidade.setText(pac1.getEnd().getCidade());
				TPlanoDeSaude.setText("Nao Possui");
				}
				else if(pac1 == null) {
					TNome.setText(pac.getNome());
					TCPF.setText(pac.getCPF());
					TRG.setText(pac.getRG());
					TNascimento.setText(pac.getData_nascimento());
					TSexo.setText(pac.getSexo());
					TEstadoCivil.setText(pac.getEstado_civil());
					TRua.setText(pac.getEnd().getRua());
					TNumero.setText(Integer.toString(pac.getEnd().getNro()));
					TComplemento.setText(pac.getEnd().getComplemento());
					TBairro.setText(pac.getEnd().getBairro());
					TCEP.setText(pac.getEnd().getCep());
					TCidade.setText(pac.getEnd().getCidade());
					TPlanoDeSaude.setText(pac.getPlano().getNome());
				}
			}
		});

		JLabel lblInformacoesDoPaciente = new JLabel("Informacoes do Paciente:");
		lblInformacoesDoPaciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblInformacoesDoPaciente.setBounds(10, 80, 156, 25);
		desktopPane.add(lblInformacoesDoPaciente);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNome.setBounds(10, 113, 50, 24);
		desktopPane.add(lblNome);

		TNome = new JTextField();
		TNome.setEditable(false);
		TNome.setColumns(10);
		TNome.setBounds(62, 113, 352, 24);
		desktopPane.add(TNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCpf.setBounds(10, 138, 50, 24);
		desktopPane.add(lblCpf);

		TCPF1 = new JTextField();
		TCPF1.setEditable(false);
		TCPF1.setColumns(10);
		TCPF1.setBounds(62, 138, 156, 24);
		desktopPane.add(TCPF1);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRg.setBounds(220, 138, 34, 24);
		desktopPane.add(lblRg);

		TRG = new JTextField();
		TRG.setEditable(false);
		TRG.setColumns(10);
		TRG.setBounds(251, 138, 163, 24);
		desktopPane.add(TRG);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento :");
		lblDataDeNascimento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDataDeNascimento.setBounds(10, 163, 116, 25);
		desktopPane.add(lblDataDeNascimento);

		TNascimento = new JTextField();
		TNascimento.setEditable(false);
		TNascimento.setColumns(10);
		TNascimento.setBounds(124, 164, 130, 23);
		desktopPane.add(TNascimento);

		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblSexo.setBounds(261, 163, 31, 25);
		desktopPane.add(lblSexo);

		TSexo = new JTextField();
		TSexo.setEditable(false);
		TSexo.setColumns(10);
		TSexo.setBounds(291, 164, 123, 23);
		desktopPane.add(TSexo);

		JLabel lblEstado_civil = new JLabel("Estado Civil:");
		lblEstado_civil.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblEstado_civil.setBounds(10, 188, 73, 25);
		desktopPane.add(lblEstado_civil);

		TEstadoCivil = new JTextField();
		TEstadoCivil.setEditable(false);
		TEstadoCivil.setColumns(10);
		TEstadoCivil.setBounds(78, 189, 150, 23);
		desktopPane.add(TEstadoCivil);

		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEndereco.setBounds(10, 211, 65, 25);
		desktopPane.add(lblEndereco);

		TRua = new JTextField();
		TRua.setEditable(false);
		TRua.setColumns(10);
		TRua.setBounds(37, 237, 259, 23);
		desktopPane.add(TRua);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblRua.setBounds(10, 236, 30, 25);
		desktopPane.add(lblRua);

		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblComplemento.setBounds(10, 259, 79, 25);
		desktopPane.add(lblComplemento);

		TComplemento = new JTextField();
		TComplemento.setEditable(false);
		TComplemento.setColumns(10);
		TComplemento.setBounds(86, 260, 130, 23);
		desktopPane.add(TComplemento);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblBairro.setBounds(219, 259, 45, 25);
		desktopPane.add(lblBairro);

		TBairro = new JTextField();
		TBairro.setEditable(false);
		TBairro.setColumns(10);
		TBairro.setBounds(261, 260, 153, 23);
		desktopPane.add(TBairro);

		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCEP.setBounds(10, 282, 31, 25);
		desktopPane.add(lblCEP);

		TCEP = new JTextField();
		TCEP.setEditable(false);
		TCEP.setColumns(10);
		TCEP.setBounds(37, 283, 114, 23);
		desktopPane.add(TCEP);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblCidade.setBounds(154, 282, 45, 25);
		desktopPane.add(lblCidade);

		TCidade = new JTextField();
		TCidade.setEditable(false);
		TCidade.setColumns(10);
		TCidade.setBounds(199, 283, 215, 23);
		desktopPane.add(TCidade);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblNumero.setBounds(304, 236, 45, 25);
		desktopPane.add(lblNumero);

		TNumero = new JTextField();
		TNumero.setEditable(false);
		TNumero.setColumns(10);
		TNumero.setBounds(353, 237, 61, 23);
		desktopPane.add(TNumero);

		JLabel lblPlanoDeSaude = new JLabel("Plano de Saude:");
		lblPlanoDeSaude.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblPlanoDeSaude.setBounds(10, 305, 89, 25);
		desktopPane.add(lblPlanoDeSaude);

		TPlanoDeSaude = new JTextField();
		TPlanoDeSaude.setEditable(false);
		TPlanoDeSaude.setColumns(10);
		TPlanoDeSaude.setBounds(103, 306, 311, 23);
		desktopPane.add(TPlanoDeSaude);

		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnSim.setBounds(173, 345, 45, 23);
		desktopPane.add(rdbtnSim);

		JRadioButton rdbtnNao = new JRadioButton("Nao");
		rdbtnNao.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnNao.setBounds(219, 345, 45, 23);
		desktopPane.add(rdbtnNao);

		ButtonGroup bg = new ButtonGroup(); // adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa
											// ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);

		JLabel lblDesejaExcluirEste = new JLabel("Deseja excluir este Paciente?");
		lblDesejaExcluirEste.setForeground(Color.RED);
		lblDesejaExcluirEste.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDesejaExcluirEste.setBounds(10, 344, 156, 25);
		desktopPane.add(lblDesejaExcluirEste);

		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnConcluir.setBounds(274, 339, 140, 30);
		desktopPane.add(btnConcluir);
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSim.isSelected()) {
					DadosPacComPlano.remove(TCPF.getText());
					DadosPacSemPlano.remove(TCPF.getText());
					JOptionPane.showMessageDialog(null, "O Paciente foi removido do sistema");
					dispose();
				}
				else if(rdbtnNao.isSelected()) {
					dispose();
				}
			}
		});
	}
}
