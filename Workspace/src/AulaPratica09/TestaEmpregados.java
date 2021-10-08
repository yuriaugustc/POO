package AulaPratica09;

import java.util.Scanner;

public class TestaEmpregados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String cpf, nascimento;
        double sal;
        Empregado emp = new Empregado();
        DadosEmpregado empregados = new DadosEmpregado();
        empregados.setEmpregados("12345678910", "12/02/1989", 1251.66);
        empregados.setEmpregados("67890238798", "23/12/2005", 5389.90);
        empregados.setEmpregados("23092032031", "01/01/2001", 2396.52);
        empregados.setEmpregados("09876543219", "02/06/1989", 6560.45);
        empregados.setEmpregados("02917374212", "27/04/1999", 5120.32);

        System.out.println("Por gentileza digite um cpf para ser procurado no sistema: ");
        cpf = leitor.next();
        System.out.println("Estes sao os dados do cpf passado para busca: ");
        empregados.pesquisaCPF(cpf);

        System.out.println("Dessa vez, digite um salario para ser procurado no sistema: ");
        sal = leitor.nextDouble();
        System.out.println("Estes sao os empregados com o salario maior que o passado para pesquisa: ");
        empregados.pesquisaSalario(sal);

        for (int i = 0; i < empregados.tamanho(); i++) {
            empregados.write("Empregado nro " + (i+1) + ":\n" +
            "CPF:" + empregados.getEmpregados(i).getCPF() + "\n" +
            "Data de Nascimento: " + empregados.getEmpregados(i).getAnoNascimento()+ "\n" +
            "Salário: " + empregados.getEmpregados(i).getSalario() + "\n");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Empregado nro " + (i+1));
            System.out.println(empregados.getEmpregados(i).getCPF());
            System.out.println(empregados.getEmpregados(i).getAnoNascimento());
            System.out.println(empregados.getEmpregados(i).getSalario());
        }
        System.out.println("maoi");
    }
}