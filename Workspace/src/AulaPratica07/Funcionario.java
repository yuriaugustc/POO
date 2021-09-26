package AulaPratica07;

import java.util.Scanner;

public abstract class Funcionario{
    private String nome;
    private String matricula;
    private double  salario_base;

    public Funcionario(String nome, String matricula, double salario_base){
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }



    abstract double calculaSalario();


}
