package AulaPratica07;

public class Vendedor extends Funcionario{
    private double comissao;
    private int vendas = 0;
    Vendedor(String nome, String matricula, double salario_base, double comissao){
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }
    @Override
    double calculaSalario() {
        double salario = getSalario_base();
        setSalario_base((salario+(comissao*vendas)));
        salario = getSalario_base();
        return salario;
    }
}
