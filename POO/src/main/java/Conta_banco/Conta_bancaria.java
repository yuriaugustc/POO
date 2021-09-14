package Conta_banco;


import java.util.Objects;

public class Conta_bancaria {
    protected static String CPF;
    protected static double saldo;
    private static int nro_conta_p = 1;
    private static int nro_conta_e = 1;
    private static Conta_Poupanca[] conta_p = new Conta_Poupanca[5];
    private static Conta_Especial[] conta_e = new Conta_Especial[5];

    public Conta_bancaria(String cpf, double sal, String cont){
        if(Objects.equals(cont, "p")) {
            int nro = setNro_conta(cont);
            if (sal == 0 || sal < 0)
                conta_p[nro].saldo = 0;
            else
                conta_p[nro].saldo = sal;
        }
        else{
            int nro = setNro_conta(cont);
            if (sal == 0 || sal < 0)
                conta_e[nro].saldo = 0;
            else
                conta_e[nro].saldo = sal;
        }
    }

    public int getNro_conta(String cont) {
        if(Objects.equals(cont, "p"))
        return nro_conta_p;
        else
        return nro_conta_e;
    }
    public int setNro_conta(String cont){
        if(Objects.equals(cont, "p")){
            nro_conta_p++;
            return nro_conta_p;
        }
        else{
            nro_conta_e++;
            return nro_conta_e;
        }
    }
    public static double getSaldo(String cont, int nro) {
        if(Objects.equals(cont, "p"))
            return conta_p[nro].saldo;
        else
            return conta_e[nro].saldo;
    }
    public void setSaldo(double saldo, int nro, String cont){
        if(Objects.equals(cont, "p"))
            if(saldo > 0)
                conta_p[nro].saldo = saldo;
            else
                conta_p[nro].saldo = 0;
        else
            if(saldo > 0)
                conta_e[nro].saldo = saldo;
            else
                conta_e[nro].saldo = 0;
    }
    public static int Sacar(int nro, double saque){
        int aux;
            if((conta_p[nro].saldo) == 0 || saque > conta_p[nro].saldo)
                aux = -1;
            else {
                saldo -= saque;
                aux = 0;
            }
        return aux;
    }
    public static void Depositar(String cont, int nro, double deposito){
        if(Objects.equals(cont, "p"))
            conta_p[nro].saldo += deposito;
        else
            conta_e[nro].saldo += deposito;
    }
}
