package InterfaceG;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.DadosPlanoSaude;
import TrabalhoPOOI.PlanoDeSaude;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JConsultaPS extends JFrame {

	private JPanel contentPane;
	private JTextField TNomePlano;
	private JTextField TCNPJ;
	private JTextField TRua;
	private JTextField TNumero;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;
	private JTextField TPesquisar;

	public JConsultaPS() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 471, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JLabel lblDadosDoPlano = new JLabel("Dados do Plano Pesquisado:");
		lblDadosDoPlano.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblDadosDoPlano.setBounds(10, 89, 185, 22);
		desktopPane.add(lblDadosDoPlano);

		JLabel lblNomePlano = new JLabel("Nome do Plano:");
		lblNomePlano.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblNomePlano.setBounds(10, 120, 109, 22);
		desktopPane.add(lblNomePlano);

		TNomePlano = new JTextField();
		TNomePlano.setEditable(false);
		TNomePlano.setColumns(10);
		TNomePlano.setBounds(118, 120, 312, 22);
		desktopPane.add(TNomePlano);

		JLabel lblCNPJ = new JLabel("CNPJ:");
		lblCNPJ.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCNPJ.setBounds(10, 145, 52, 22);
		desktopPane.add(lblCNPJ);

		TCNPJ = new JTextField();
		TCNPJ.setEditable(false);
		TCNPJ.setColumns(10);
		TCNPJ.setBounds(64, 145, 195, 22);
		desktopPane.add(TCNPJ);

		JLabel lblE = new JLabel("Endereco do Plano:");
		lblE.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblE.setBounds(10, 170, 133, 22);
		desktopPane.add(lblE);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblRua.setBounds(10, 200, 43, 22);
		desktopPane.add(lblRua);

		TRua = new JTextField();
		TRua.setEditable(false);
		TRua.setColumns(10);
		TRua.setBounds(53, 200, 195, 22);
		desktopPane.add(TRua);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblNumero.setBounds(258, 200, 57, 22);
		desktopPane.add(lblNumero);

		TNumero = new JTextField();
		TNumero.setEditable(false);
		TNumero.setColumns(10);
		TNumero.setBounds(325, 200, 105, 22);
		desktopPane.add(TNumero);

		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblComplemento.setBounds(10, 225, 99, 22);
		desktopPane.add(lblComplemento);

		TComplemento = new JTextField();
		TComplemento.setEditable(false);
		TComplemento.setColumns(10);
		TComplemento.setBounds(118, 225, 99, 22);
		desktopPane.add(TComplemento);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblBairro.setBounds(227, 225, 52, 22);
		desktopPane.add(lblBairro);

		TBairro = new JTextField();
		TBairro.setEditable(false);
		TBairro.setColumns(10);
		TBairro.setBounds(280, 225, 150, 22);
		desktopPane.add(TBairro);

		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCEP.setBounds(10, 250, 43, 22);
		desktopPane.add(lblCEP);

		TCEP = new JTextField();
		TCEP.setEditable(false);
		TCEP.setColumns(10);
		TCEP.setBounds(53, 250, 144, 22);
		desktopPane.add(TCEP);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCidade.setBounds(207, 250, 57, 22);
		desktopPane.add(lblCidade);

		TCidade = new JTextField();
		TCidade.setEditable(false);
		TCidade.setColumns(10);
		TCidade.setBounds(265, 250, 165, 22);
		desktopPane.add(TCidade);

		JLabel lblTittle = new JLabel("Consulta de Plano de Saude");
		lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTittle.setBounds(104, 11, 241, 25);
		desktopPane.add(lblTittle);

		JLabel lblInsiraPorGentileza = new JLabel("Insira por gentileza o CNPJ do Plano que deseja buscar:");
		lblInsiraPorGentileza.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		lblInsiraPorGentileza.setBounds(10, 33, 404, 19);
		desktopPane.add(lblInsiraPorGentileza);

		TPesquisar = new JTextField();
		TPesquisar.setColumns(10);
		TPesquisar.setBounds(10, 54, 294, 24);
		desktopPane.add(TPesquisar);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		btnPesquisar.setBounds(314, 55, 100, 23);
		desktopPane.add(btnPesquisar);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanoDeSaude plan = new PlanoDeSaude();
				TNomePlano.setText(plan.getNome());
				TCNPJ.setText(plan.getCNPJ());
				TRua.setText(plan.getEnd().getRua());
				TNumero.setText(Integer.toString(plan.getEnd().getNro()));
				TComplemento.setText(plan.getEnd().getComplemento());
				TBairro.setText(plan.getEnd().getBairro());
				TCEP.setText(plan.getEnd().getCep());
				TCidade.setText(plan.getEnd().getCidade());
			}
		});

		JLabel lblDesejaExcluirEste = new JLabel("Deseja excluir este Plano?");
		lblDesejaExcluirEste.setForeground(Color.RED);
		lblDesejaExcluirEste.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDesejaExcluirEste.setBounds(10, 289, 144, 25);
		desktopPane.add(lblDesejaExcluirEste);

		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnSim.setBounds(157, 290, 45, 23);
		desktopPane.add(rdbtnSim);

		JRadioButton rdbtnNao = new JRadioButton("Nao");
		rdbtnNao.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		rdbtnNao.setBounds(203, 290, 45, 23);
		desktopPane.add(rdbtnNao);

		ButtonGroup bg = new ButtonGroup(); // adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa
											// ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);

		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnConcluir.setBounds(252, 283, 178, 30);
		desktopPane.add(btnConcluir);
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNao.isSelected()) {
					dispose();
				} else if (rdbtnSim.isSelected()) {
					DadosPlanoSaude.remove(TPesquisar.getText());
					JOptionPane.showMessageDialog(null, "O Plano de Saude foi removido do sistema.");
					dispose();
				}
			}
		});
	}
}
