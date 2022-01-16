package TrabalhoPOOI;

import java.io.Serializable;

public abstract class Funcionario extends Pessoa implements Serializable {
	private String data_admissao;
	private int matricula;
	private String cargo;
	private Salario salario;
	private Sistema sistema;

	public Funcionario(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil,
			String rua, int nro, String complemento, String bairro, String cep, String cidade, String admissao,
			int matricula, String cargo, double salario, String login, String senha) {
		super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
		setData_admissao(admissao);
		setMatricula(matricula);
		setCargo(cargo);
		setSistema(login, senha);
		setSalario(salario);
	}

	public Funcionario() {
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public abstract void AlteraCargo(String cargo); // Esta é a função escolhida para a questão 5.c;
	// Esta necessita ser abstrata pois existe uma classe especifica para o medico,
	// então é preciso que exista a separação quando setado o cargo;
	// Como existe a hierarquia Funcionario->Medico->OutrosFuncionarios,
	// o metodo abstrado só precisa ser setado na classe médico,
	// o único lugar onde já está definido o cargo do funcionário;

	public void setSalario(double sal) {
		salario.setSalario(sal);
	}

	public abstract void CalcularSalario(double sal);

	public double getSalario() {
		return salario.getSalario();
	}

	public void setSistema(String login, String senha) {
		sistema.setLogin(login);
		sistema.setSenha(senha);
	}

	public String getLogin() {
		return sistema.getLogin();
	}

	public String getSenha() {
		return sistema.getSenha();
	}
}
