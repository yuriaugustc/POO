package AulaPratica09;

import java.util.Scanner;

public class TestaEmpregados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        String cpf, nascimento;
        int qtd;
        double sal;
        Empregado emp = new Empregado();
        DadosEmpregado empregados = new DadosEmpregado();
        System.out.println("Quantos empregados deseja cadastrar? ");
        qtd = leitor.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o CPF do empregado nro" + (i+1) + ":");
            cpf = leitorString.nextLine();
            System.out.println("Digite a data de nascimento do empregado: (utilize barra de separacao : dd/mm/aaaa)");
            nascimento = leitorString.nextLine();
            System.out.println("Digite o salario do empregado: ");
            sal = leitor.nextDouble();
            empregados.setEmpregados(cpf,nascimento, sal);
        }
        /*
        empregados.setEmpregados("12345678910", "12/06/1989", 1251.23);
        empregados.setEmpregados("67890238798", "23/12/2005", 5389.12);
        empregados.setEmpregados("23092032031", "01/01/2001", 2396.54); //inputs prontos para teste de funcionamento;
        empregados.setEmpregados("09876543219", "02/06/1989", 6560.98);
        empregados.setEmpregados("02917374212", "27/04/1999", 5120.12);
        */
        empregados.getEmpregados(1).compareTo(empregados.getEmpregados(0));
        System.out.println("---------------------------------------");
        empregados.getEmpregados(3).compareTo(empregados.getEmpregados(0));
        System.out.println("---------------------------------------");
        empregados.getEmpregados(4).compareTo(empregados.getEmpregados(1));
        System.out.println("Por gentileza digite um cpf para ser procurado no sistema: ");
        cpf = leitorString.nextLine();
        System.out.println("Estes sao os dados do cpf passado para busca: ");
        empregados.pesquisaCPF(cpf);

        System.out.println("Dessa vez, digite um salario para ser procurado no sistema: ");
        sal = leitor.nextDouble();
        System.out.println("Estes sao os empregados com o salario maior que o passado para pesquisa:\n");
        empregados.pesquisaSalario(sal);

        empregados.writeText();
        empregados.writeBinary();
    }
}