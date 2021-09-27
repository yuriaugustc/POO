package AulaPratica07;

public class Gerente extends Funcionario{

    Gerente(String nome, String matricula, double salario_base){
        super(nome, matricula, salario_base);
    }
    @Override
    double calculaSalario() {
        double salario = getSalario_base();
        setSalario_base((salario*2));
        salario = getSalario_base(); //fiquei na duvida se precisaria atualizar o valor de salario;
        return salario;
    }
}
