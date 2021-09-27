package AulaPratica07;

public class Assistente extends Funcionario{

    Assistente(String nome, String matricula, double salario_base){
        super(nome, matricula, salario_base);
    }
    @Override
    double calculaSalario() {
        double salario = getSalario_base();
        return salario;
    }
}
