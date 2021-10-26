package TrabalhoPOOI;

import java.io.*;
import java.util.ArrayList;

public abstract class DadosPaciente implements Serializable {
    private ArrayList<Paciente> vetPac = new ArrayList<Paciente>();

    public void cadastra(Paciente c){
        this.vetPac.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de pacientes:");
        System.out.println(this.vetPac.size());
    }

    public void list(){
        for(Paciente objeto : this.vetPac) {
            objeto.mostraDados();
        }
    }
    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public Paciente search(String cpf){
        Paciente c = null;
        for(Paciente objeto : this.vetPac){
            if(objeto.getCPF().equals(cpf)){
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método buscar já implementado
    public boolean remove(String cpf){
        Paciente c = this.search(cpf);
        if(c!=null){
            this.vetPac.remove(c);
            return true;
        }else{
            return false;
        }
    }

    public abstract void writeBinary();
}
