package AulaPratica09;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class DadosEmpregado extends Empregado implements Serializable{
    private ArrayList<Empregado> empregados = new ArrayList<>();

    public DadosEmpregado(String CPF, String anoNascimento, double salario) {
        setEmpregados(CPF, anoNascimento, salario);
    }

    public DadosEmpregado() {
    }

    public void setEmpregados(String CPF, String anoNascimento, double salario) {
            empregados.add(new Empregado(CPF, anoNascimento, salario));
    }

    public Empregado getEmpregados(int i) {
        return empregados.get(i);
    }

    public void removeEmpregados(String cpf){
        for ( Empregado emp : empregados) {
            String aux = emp.getCPF();
            if(aux == cpf){
                empregados.remove(emp);
                break;
            }
        }
    }
    public void pesquisaCPF(String cpf){
        int i = 0;
        for(Empregado emp : empregados){
            String aux = empregados.get(i).getCPF();
            if(aux.equals(cpf)) {
                System.out.println("CPF: " + empregados.get(i).getCPF());
                System.out.println("Nascimento: " + empregados.get(i).getAnoNascimento());
                System.out.println("Salario: " + empregados.get(i).getSalario());
                break;
            }
            i++;
        }
    }

    public void pesquisaSalario(double salario){
        int i = 0;
        for(Empregado emp : empregados){
            double aux = empregados.get(i).getSalario();
            if(aux > salario){
                System.out.println("CPF: " + empregados.get(i).getCPF());
                System.out.println("Nascimento: " + empregados.get(i).getAnoNascimento());
                System.out.println("Salario: " + empregados.get(i).getSalario());
                System.out.println("---------------------------------------");
            }
            i++;
        }
    }

    public void writeText(){

        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(
                        new FileWriter("Text"));
            writer.write("---------------------------------------");
            writer.write("\n       Persistencia em Texto:\n");
            for(int i = 0; i < empregados.size(); i++) {
                writer.write("---------------------------------------\n");
                writer.write("\nEmpregado nro " + (i+1) + ":\n\n" +
                        "CPF: " + empregados.get(i).getCPF() + "\n" +
                        "Data de Nascimento: " + empregados.get(i).getAnoNascimento()+ "\n" +
                        "Salário: " + empregados.get(i).getSalario() + "\n\n");
                writer.flush();
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeBinary(){
        FileOutputStream fileWriter = null;
        ObjectOutputStream ObjWriter = null;
        try {
            fileWriter = new FileOutputStream("Binary");
            ObjWriter = new ObjectOutputStream(fileWriter);
            ObjWriter.writeObject("\n       Persistencia em Binario:\n\n");
            for(int i = 0; i < empregados.size(); i++) {
                ObjWriter.writeObject("\nEmpregado nro " + (i+1) + ":\n\n" +
                        "CPF: " + empregados.get(i).getCPF() + "\n" +
                        "Data de Nascimento: " + empregados.get(i).getAnoNascimento()+ "\n" +
                        "Salário: " + empregados.get(i).getSalario() + "\n\n"); //Tem que implementar a //interface Serializable!
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int tamanho(){
        return empregados.size();
    }
}
