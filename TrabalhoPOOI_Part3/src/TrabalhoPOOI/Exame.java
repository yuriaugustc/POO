package TrabalhoPOOI;

public class Exame {
	private String nomeExame;
	private String procedimento;
	private String recursos;

	public Exame(String nomeExame, String procedimento, String recursos) {
		setNomeExame(nomeExame);
		setProcedimento(procedimento);
		setRecursos(recursos);
	}

	public Exame(String nome) {
		setNomeExame(nome);
	}

	public Exame() {
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getRecursos() {
		return recursos;
	}

	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}
}
