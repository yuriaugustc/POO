package TrabalhoPOOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosFuncionarios {
    private static ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();

    public static void cadastrar(Funcionario c) {
        vetFunc.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de Funcionarios:");
        System.out.println(vetFunc.size());
    }

    public static void listar() {
        for (Funcionario objeto : vetFunc) {
            objeto.mostraDados();
        }
    }

    //este método retorna o objeto Funcionario caso encontrado, ou null, caso não encontrado
    public static Funcionario buscar(String cpf) {
        Funcionario c = null;
        for (Funcionario objeto : vetFunc) {
            if (objeto.getCPF().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método search já implementado
    public static boolean remove (String cpf){
        Funcionario c = buscar(cpf);
        if (c != null) {
            vetFunc.remove(c);
            return true;
        } else {
            return false;
        }
    }

    public static void write() {
    	for(Funcionario func : vetFunc) {
    		Persist.write(func, "dadosFuncionarios");
    	}
    }
    
    public void writeBinary(){
        FileOutputStream fileWriter = null;
        ObjectOutputStream ObjWriter = null;
        try {
            fileWriter = new FileOutputStream("Binary");
            ObjWriter = new ObjectOutputStream(fileWriter);
            ObjWriter.writeObject("\n       Persistencia em Binario:\n\n");
            for(Funcionario func : vetFunc) {
                int i = 0;
                ObjWriter.writeObject("\nFuncionario nro " + (i+1) + ":\n");
                ObjWriter.writeObject("\nNome do Funcionario: " + vetFunc.get(i).getNome());
                ObjWriter.writeObject("\nNascimento do Funcionario: " + vetFunc.get(i).getData_nascimento());
                ObjWriter.writeObject("\nCPF do Funcionario: " + vetFunc.get(i).getCPF());
                ObjWriter.writeObject("\nRG do Funcionario: " + vetFunc.get(i).getRG());
                ObjWriter.writeObject("\nEndereco: " + vetFunc.get(i).getEndereco());
                ObjWriter.writeObject("\nSexo: " + vetFunc.get(i).getSexo());
                ObjWriter.writeObject("\nEStado Civil: " + vetFunc.get(i).getEstado_civil());
                ObjWriter.writeObject("\nDados Empresariais: ");
                ObjWriter.writeObject("\nAdmissao: " + vetFunc.get(i).getData_admissao());
                ObjWriter.writeObject("\nMatricula: " + vetFunc.get(i).getMatricula());
                ObjWriter.writeObject("\nCargo: " + vetFunc.get(i).getCargo());
                ObjWriter.writeObject("\nSalario: " + vetFunc.get(i).getSalario());
                ObjWriter.writeObject("\nLogin no sistema: " + vetFunc.get(i).getLogin());
                ObjWriter.writeObject("\nSenha no sistema: " + vetFunc.get(i).getSenha());
                //Tem que implementar a //interface Serializable!
                i++;
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
}


