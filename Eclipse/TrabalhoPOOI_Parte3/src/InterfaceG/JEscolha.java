package InterfaceG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JEscolha extends JFrame {

	private JPanel contentPane;

	public JEscolha(String st) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 405, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		if(st.equals("Cadastro")) {
			JLabel lblTittle = new JLabel("Voc\u00EA deseja realizar um cadastro de ... ?");
			lblTittle.setBounds(25, 11, 326, 42);
			desktopPane.add(lblTittle);
			lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		}
		if(st.equals("Consulta")) {
			JLabel lblTittle = new JLabel("Voc\u00EA deseja realizar uma consulta de ... ?");
			lblTittle.setBounds(25, 11, 326, 42);
			desktopPane.add(lblTittle);
			lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		}
		if(st.equals("Exclusao")) {
			JLabel lblTittle = new JLabel("Voc\u00EA deseja realizar uma exclusao de ... ?");
			lblTittle.setBounds(25, 11, 326, 42);
			desktopPane.add(lblTittle);
			lblTittle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		}
		JButton btnPaciente = new JButton("Paciente");
		btnPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(st.equals("Cadastro")) {
					JCadastroP cadastro = new JCadastroP();
					cadastro.setVisible(true);
					cadastro.setLocationRelativeTo(null);
					cadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
				if(st.equals("Consulta")) {
					JConsultaP consulta = new JConsultaP();
					consulta.setVisible(true);
					consulta.setLocationRelativeTo(null);
					consulta.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
				if(st.equals("Exclusao")) {
					JOptionPane.showMessageDialog(null,"Para realizar a exclusao de um Paciente, pesquise-o no sistema e selecione o botao para excluir.");
					JConsultaP exclusao = new JConsultaP();
					exclusao.setVisible(true);
					exclusao.setLocationRelativeTo(null);
					exclusao.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					dispose();
				}
				
			}
		});
		btnPaciente.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		btnPaciente.setBounds(112, 74, 145, 42);
		desktopPane.add(btnPaciente);
		
		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(st.equals("Cadastro")) {
					JCadastroF cadastro = new JCadastroF();
					cadastro.setVisible(true);
					cadastro.setLocationRelativeTo(null);
					dispose();
				}
				if(st.equals("Consulta")) {
					JConsultaF consulta = new JConsultaF();
					consulta.setVisible(true);
					consulta.setLocationRelativeTo(null);
					dispose();
				}
				if(st.equals("Exclusao")) {
					JConsultaF exclusao = new JConsultaF();
					JOptionPane.showMessageDialog(null,"Para realizar a exclusao de um Funcionario, pesquise-o no sistema e selecione o botao para excluir.");
					exclusao.setVisible(true);
					exclusao.setLocationRelativeTo(null);
					dispose();
				}
			}
		});
		btnFuncionario.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		btnFuncionario.setBounds(112, 127, 145, 42);
		desktopPane.add(btnFuncionario);
		
		JButton btnPlanoSaude = new JButton("Plano de Saude");
		btnPlanoSaude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(st.equals("Cadastro")) {
					JCadastroPST plano = new JCadastroPST();
					plano.setVisible(true);
					plano.setLocationRelativeTo(null);
					dispose();
					}
				if(st.equals("Consulta")) {
					JConsultaPS consulta = new JConsultaPS();
					consulta.setVisible(true);
					consulta.setLocationRelativeTo(null);
					dispose();
				}
				if(st.equals("Exclusao")) {
					JConsultaPS exclusao = new JConsultaPS();
					JOptionPane.showMessageDialog(null,"Para realizar a exclusao de um Plano de Saude, pesquise-o no sistema e selecione o botao para excluir.");
					exclusao.setVisible(true);
					exclusao.setLocationRelativeTo(null);
					dispose();
				}
			}
		});
		btnPlanoSaude.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		btnPlanoSaude.setBounds(112, 181, 145, 42);
		desktopPane.add(btnPlanoSaude);
	}
}
