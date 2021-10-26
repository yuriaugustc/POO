package TrabalhoPOOI;

public class PlanoDeSaude {
    private String Nome;
    private String CNPJ;
    private Endereco endereco;

    public PlanoDeSaude(String nome, String CNPJ, Endereco endereco) {
        setNome(nome);
        setCNPJ(CNPJ);
        setEndereco(endereco);
    }
    public PlanoDeSaude(String nome){
        setNome(nome);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
