package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.DadosPacComPlano;
import TrabalhoPOOI.DadosPacSemPlano;
import TrabalhoPOOI.PacienteComPlano;
import TrabalhoPOOI.PacienteSemPlano;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class JCadastroPST extends JFrame {

	private JPanel contentPane;
	private JTextField TNomePlano;
	private JTextField TCNPJ;
	private JTextField TRua;
	private JTextField TNumero;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCEP;
	private JTextField TCidade;

	public JCadastroPST(String cpf) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 456, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlanoDeSaude = new JLabel("Cadastro de Plano de Saude");
		lblPlanoDeSaude.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblPlanoDeSaude.setBounds(95, 11, 247, 22);
		contentPane.add(lblPlanoDeSaude);
		
		JLabel lblInformacoes = new JLabel("Preencha a seguir as informacoes do Plano de Saude:");
		lblInformacoes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblInformacoes.setBounds(10, 44, 347, 22);
		contentPane.add(lblInformacoes);
		
		JLabel lblNomePlano = new JLabel("Nome do Plano: ");
		lblNomePlano.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblNomePlano.setBounds(10, 75, 109, 22);
		contentPane.add(lblNomePlano);
		
		TNomePlano = new JTextField();
		TNomePlano.setBounds(118, 75, 312, 22);
		contentPane.add(TNomePlano);
		TNomePlano.setColumns(10);
		
		JLabel lblCNPJ = new JLabel("CNPJ: ");
		lblCNPJ.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCNPJ.setBounds(10, 100, 52, 22);
		contentPane.add(lblCNPJ);
		
		TCNPJ = new JTextField();
		TCNPJ.setColumns(10);
		TCNPJ.setBounds(64, 100, 195, 22);
		contentPane.add(TCNPJ);
		
		JLabel lblPreenchaASeguir = new JLabel("Preencha a seguir o endereco da sede do Plano de Saude:");
		lblPreenchaASeguir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPreenchaASeguir.setBounds(10, 122, 380, 22);
		contentPane.add(lblPreenchaASeguir);
		
		JLabel lblRua = new JLabel("Rua: ");
		lblRua.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblRua.setBounds(10, 155, 43, 22);
		contentPane.add(lblRua);
		
		TRua = new JTextField();
		TRua.setColumns(10);
		TRua.setBounds(53, 155, 195, 22);
		contentPane.add(TRua);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblNumero.setBounds(258, 155, 57, 22);
		contentPane.add(lblNumero);
		
		TNumero = new JTextField();
		TNumero.setColumns(10);
		TNumero.setBounds(325, 155, 105, 22);
		contentPane.add(TNumero);
		
		JLabel lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblComplemento.setBounds(10, 180, 99, 22);
		contentPane.add(lblComplemento);
		
		TComplemento = new JTextField();
		TComplemento.setColumns(10);
		TComplemento.setBounds(118, 180, 99, 22);
		contentPane.add(TComplemento);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblBairro.setBounds(227, 180, 52, 22);
		contentPane.add(lblBairro);
		
		TBairro = new JTextField();
		TBairro.setColumns(10);
		TBairro.setBounds(280, 180, 150, 22);
		contentPane.add(TBairro);
		
		JLabel lblCEP = new JLabel("CEP: ");
		lblCEP.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCEP.setBounds(10, 205, 43, 22);
		contentPane.add(lblCEP);
		
		TCEP = new JTextField();
		TCEP.setColumns(10);
		TCEP.setBounds(53, 205, 144, 22);
		contentPane.add(TCEP);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCidade.setBounds(207, 205, 57, 22);
		contentPane.add(lblCidade);
		
		TCidade = new JTextField();
		TCidade.setColumns(10);
		TCidade.setBounds(265, 205, 165, 22);
		contentPane.add(TCidade);
		
		JLabel lblCarencia = new JLabel("Esta em periodo de carencia? ");
		lblCarencia.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblCarencia.setBounds(10, 230, 196, 22);
		contentPane.add(lblCarencia);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setBounds(207, 230, 52, 23);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNao = new JRadioButton("Nao");
		rdbtnNao.setBounds(263, 230, 52, 23);
		contentPane.add(rdbtnNao);
		
		ButtonGroup bg = new ButtonGroup(); //adicionar os RadioButtons à um ButtonGroupp faz com apenas um deles possa ser pressionado;
		bg.add(rdbtnSim);
		bg.add(rdbtnNao);
		
		JButton Concluir = new JButton("Concluir");
		Concluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		Concluir.setBounds(321, 230, 109, 23);
		contentPane.add(Concluir);
		Concluir.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim.isSelected() || rdbtnNao.isSelected()) {
					PacienteComPlano pac = new PacienteComPlano();
					pac = DadosPacComPlano.search(cpf);
					int vlr = Integer.parseInt(TNumero.getText());
					pac.setPlanoAtivo(TNomePlano.getText(), TCNPJ.getText(), TRua.getText(), vlr, TComplemento.getText(), TBairro.getText(), TCEP.getText(), TCidade.getText());
					DadosPacSemPlano.remove(cpf);
					DadosPacSemPlano.cadastra(pac);
					DadosPacSemPlano.write();
					dispose();
				}
			}
		});
		
	}
}
