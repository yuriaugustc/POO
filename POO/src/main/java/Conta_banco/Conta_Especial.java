package Conta_banco;

import java.math.BigInteger;

public class Conta_Especial extends Conta_Poupanca{
    private static double limite = -100.00;
    //private char conta = 'e';

    public Conta_Especial(String cpf, double sal, String cont){
        super(cpf, sal, cont);
    }

    public static int SaqueEspecial(String cont, int nro, double saque){ //consertar o getSaldo
        double aux = getSaldo(cont = "e", nro);
        int aux1;
        if((aux - saque)<limite)
            aux1 = 0;
        else
            aux1 = 1;
        return aux1;
    }
}
