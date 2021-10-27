package TrabalhoPOOI;

import java.io.*;
import java.util.ArrayList;

public abstract class DadosPaciente implements Serializable {
    private static ArrayList<Paciente> vetPac = new ArrayList<Paciente>();

    public static void cadastra(Paciente c){
        vetPac.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de pacientes:");
        System.out.println(vetPac.size());
    }

    public void list(){
        for(Paciente objeto : this.vetPac) {
            objeto.mostraDados();
        }
    }
    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public static Paciente search(String cpf){
        Paciente c = null;
        for(Paciente objeto : vetPac){
            if(objeto.getCPF().equals(cpf)){
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método buscar já implementado
    public static boolean remove(String cpf){
        Paciente c = search(cpf);
        if(c!=null){
            vetPac.remove(c);
            return true;
        }else{
            return false;
        }
    }
    
    public static void write() {
    	for(Paciente pac : vetPac) {
    		Persist.write(pac, "dadosPacientes");
    	}
    }

    public abstract void writeBinary();
}
