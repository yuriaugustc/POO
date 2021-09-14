package Conta_banco;

import java.util.Objects;
import java.util.Scanner;

public class FrontEnd extends Conta_Especial{

    public FrontEnd(String cpf, double sal, String cont) {
        super(cpf, sal, cont);
    }

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        String cont;
        int op = 0, sal = 0, nro_conta;
        String cpf;
        while(op != 1) {
            System.out.println("******* CONTA BANCÁRIA *******");
            System.out.println("Bem Vindo ao sistema de conta bancária!");
            System.out.println("Por favor, selecione uma opcao para continuar\n");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Conta Especial");
            System.out.println("3 - Conta Poupança");
            System.out.println("4 - Sair");
            op = opcao.nextInt();
            switch(op){
                case 1: {
                    System.out.println("Deseja criar uma conta poupanca ou especial? (p / e)");
                    cont = opcao.next();
                    System.out.println("Por favor, digite seu CPF: ");
                    cpf = opcao.next();
                    if (Objects.equals(cont, "e"))
                        new Conta_Especial(cpf, 0, cont);
                    if (Objects.equals(cont, "p"))
                        new Conta_Poupanca(cpf, 0, cont);
                    else{
                        System.out.println("Desculpe, não foi possivel reconhecer o tipo desejado, tente novamente.");
                        return;
                    }
                    System.out.println("Conta Criada com sucesso!");

                }
                case 2:{
                    System.out.println("1 - Realizar Deposito");
                    System.out.println("2 - Realizar Saque");
                    System.out.println("3 - Verificar o saldo");
                    op = opcao.nextInt();
                    if(op == 1) {
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Quanto de deposito deseja realizar? ");
                        sal = opcao.nextInt();
                        Depositar("e", nro_conta, sal);
                        System.out.println("Deposito realizado com sucesso!");
                    }
                    if(op == 2){
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Quanto deseja sacar de sua conta? ");
                        sal = opcao.nextInt();
                        int aux = SaqueEspecial("e", nro_conta, sal);
                        if(aux == 0)
                            System.out.println("Saque realizado com sucesso!");
                        else
                            System.out.println("Algo deu errado... Verifique seu saldo e tente novamente!");
                    }
                    if(op == 3){
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Este é o seu saldo: " + getSaldo("e", nro_conta));
                    }
                }
                case 3:{
                    System.out.println("1 - Realizar Deposito");
                    System.out.println("2 - Realizar Saque");
                    System.out.println("3 - Verificar o saldo");
                    System.out.println("4 - Verificar rendimento do mes");
                    op = opcao.nextInt();
                    if(op == 1) {
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Quanto de deposito deseja realizar? ");
                        sal = opcao.nextInt();
                        Depositar("p", nro_conta, sal);
                        System.out.println("Deposito realizado com sucesso!");
                    }
                    if(op == 2){
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Quanto deseja sacar de sua conta? ");
                        sal = opcao.nextInt();
                        int aux = Sacar(nro_conta, sal);
                        if(aux == 0)
                            System.out.println("Saque realizado com sucesso!");
                        else
                            System.out.println("Algo deu errado... Verifique seu saldo e tente novamente!");
                    }
                    if(op == 3) {
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Este é o seu saldo: " + getSaldo("p", nro_conta));
                    }
                    if(op == 4){
                        System.out.println("Insira por favor o numero de sua conta");
                        nro_conta = opcao.nextInt();
                        System.out.println("Este é o rendimento mensal: (0.08 ao mes)");
                        System.out.println(CalcularNovoSaldo("p", nro_conta));
                    }
                }
                default:
                    return;
            }
        }
    }
}
