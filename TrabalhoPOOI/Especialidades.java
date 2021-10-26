package TrabalhoPOOI;

public interface Especialidades { // A interface Especialidades foi a escolhida para o tópico 6.c

    public String getNomeEspecialidade();

    public void setNomeEspecialidade(String nome);

    public String getDescricao();

    public void setDescricao(String descrição);
}

/*
*   A interface consiste em implementar as especialidades do Medico que são um de seus requisitos descritos;
*   Dessa forma, implementando como interface, deixa vinculado como se fosse um contrato, a implementação dos
*   métodos para preenchimento dos dados encapsulados de especialidades do médico;
*/