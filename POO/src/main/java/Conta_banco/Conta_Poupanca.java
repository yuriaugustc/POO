package Conta_banco;

import java.math.BigInteger;

public class Conta_Poupanca extends Conta_bancaria{
    private static double rend_mensal = 0.08f;
    private int i = 0;
    //private char cont = 'p';

    public Conta_Poupanca(String cpf, double sal, String cont) {
        super(cpf, sal, cont);
    }

    public static double CalcularNovoSaldo(String cont, int nro) { // criar uma funcao para verificar o rendimento mensal no frontEnd
        double rend;
        double saldo = getSaldo(cont, nro);
        rend = (rend_mensal * saldo) + saldo;
        return rend;
    }
}
