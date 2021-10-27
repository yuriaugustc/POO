package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrabalhoPOOI.DadosPacSemPlano;
import TrabalhoPOOI.PacienteSemPlano;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class JCadastroPSF extends JFrame {

	private JPanel contentPane;
	private JTextField TDataUltConsulta;
	private JTextField TValorUltConsulta;

	public JCadastroPSF(String cpf) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 473, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltittle = new JLabel("Paciente sem Plano");
		lbltittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lbltittle.setBounds(153, 11, 144, 36);
		contentPane.add(lbltittle);
		
		JLabel lblPorVoceNao = new JLabel("Por voce nao possuir um plano, disponibilizamos um desconto especial.");
		lblPorVoceNao.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 10));
		lblPorVoceNao.setBounds(10, 48, 396, 22);
		contentPane.add(lblPorVoceNao);
		
		JLabel lblParaIssoPrecisamos = new JLabel("Para isso, precisamos que preencha as informa\u00E7\u00F5es a seguir:");
		lblParaIssoPrecisamos.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 10));
		lblParaIssoPrecisamos.setBounds(10, 71, 380, 22);
		contentPane.add(lblParaIssoPrecisamos);
		
		JLabel lblDataDaUltima = new JLabel("Data da ultima Consulta (dd/mm/aaaa):");
		lblDataDaUltima.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblDataDaUltima.setBounds(10, 98, 212, 22);
		contentPane.add(lblDataDaUltima);
		
		TDataUltConsulta = new JTextField();
		TDataUltConsulta.setBounds(232, 99, 131, 20);
		contentPane.add(TDataUltConsulta);
		TDataUltConsulta.setColumns(10);
		
		JLabel lblValorDaUltima = new JLabel("Valor da ultima consulta: ");
		lblValorDaUltima.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblValorDaUltima.setBounds(10, 125, 136, 22);
		contentPane.add(lblValorDaUltima);
		
		TValorUltConsulta = new JTextField();
		TValorUltConsulta.setBounds(192, 126, 171, 20);
		contentPane.add(TValorUltConsulta);
		TValorUltConsulta.setColumns(10);
		
		JLabel lblCasoSejaSua = new JLabel("Caso seja sua primeira vez na clinica, marque a opcao abaixo:");
		lblCasoSejaSua.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 10));
		lblCasoSejaSua.setBounds(10, 152, 347, 22);
		contentPane.add(lblCasoSejaSua);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nao possuo uma ultima consulta");
		rdbtnNewRadioButton.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton.setBounds(98, 181, 223, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton Concluir = new JButton("Concluir");
		Concluir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		Concluir.setBounds(327, 181, 120, 23);
		contentPane.add(Concluir);
		
		JLabel lblR = new JLabel("R$:");
		lblR.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		lblR.setBounds(168, 125, 24, 22);
		contentPane.add(lblR);
		Concluir.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				PacienteSemPlano pac = new PacienteSemPlano();
				pac = DadosPacSemPlano.search(cpf);
				pac.setUltima_consulta(TDataUltConsulta.getText());
				double vlr = Double.parseDouble(TValorUltConsulta.getText());
				pac.setValor_ult_consulta(vlr);
				DadosPacSemPlano.remove(cpf);
				DadosPacSemPlano.cadastra(pac);
				DadosPacSemPlano.write();
				dispose();
			}
		});
		}
}
