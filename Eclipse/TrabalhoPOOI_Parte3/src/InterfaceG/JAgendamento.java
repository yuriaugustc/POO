package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class JAgendamento extends JFrame {

	private JPanel contentPane;
	private JTextField TNomeCompleto;
	private JTextField TCPF;
	private JTextField TDataNascimento;
	private JTextField TRG;
	private JTextField TSexo;
	private JTextField TEstadoCivil;
	private JTextField TRua;
	private JTextField textField_7;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;
	private JTextField TNumero;

	public JAgendamento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 370);
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(87, 236, 130, 23);
		desktopPane.add(textField_7);
		
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
		lblPossuiUmPlano.setBounds(11, 289, 150, 25);
		desktopPane.add(lblPossuiUmPlano);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim", false);
		rdbtnSim.setForeground(Color.BLACK);
		rdbtnSim.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		rdbtnSim.setBackground(Color.WHITE);
		rdbtnSim.setBounds(159, 290, 45, 23);
		desktopPane.add(rdbtnSim);
		
		JRadioButton rdbtnNao = new JRadioButton("Nao", false);
		rdbtnNao.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		rdbtnNao.setBackground(Color.WHITE);
		rdbtnNao.setBounds(210, 290, 45, 23);
		desktopPane.add(rdbtnNao);
		
		ButtonGroup bg = new ButtonGroup(); //adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);
		
		JButton btnAvancar = new JButton("Avancar");
		btnAvancar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnAvancar.setBounds(263, 290, 206, 23);
		desktopPane.add(btnAvancar);
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim.isSelected()) {
					JCadPSTAG plano = new JCadPSTAG();
					plano.setVisible(true);
					plano.setLocationRelativeTo(null);
					plano.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
				else if(rdbtnNao.isSelected()) {
					JCadPSFAG plano = new JCadPSFAG();
					plano.setVisible(true);
					plano.setLocationRelativeTo(null);
					plano.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
			}
		});
	}
}
