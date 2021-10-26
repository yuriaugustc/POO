package TrabalhoPOOI;

public class PlanoDeSaude {
    private String Nome;
    private String CNPJ;
    private Endereco endereco;

    public PlanoDeSaude(String nome, String CNPJ, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        setNome(nome);
        setCNPJ(CNPJ);
        setEndereco(rua, nro, complemento, bairro, cep, cidade);
    }
    public PlanoDeSaude(String nome){
        setNome(nome);
    }

    public PlanoDeSaude(String nome, String cnpj){
        setNome(nome);
        setCNPJ(cnpj);
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

    public String getEndereco() {
        return endereco.getEndereco();
    }

    public void setEndereco(String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        endereco.setRua(rua);
        endereco.setNro(nro);
        endereco.setComplemento(complemento);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
    }
}
