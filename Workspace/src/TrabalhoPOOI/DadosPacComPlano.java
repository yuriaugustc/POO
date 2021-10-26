package TrabalhoPOOI;

import java.io.*;
import java.util.ArrayList;

public class DadosPacComPlano implements Serializable {
    private ArrayList<PacienteComPlano> vetPac = new ArrayList<PacienteComPlano>();

    public void cadastra(PacienteComPlano c){
        this.vetPac.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de pacientes:");
        System.out.println(this.vetPac.size());
    }

    public void list(){
        for(PacienteComPlano objeto : this.vetPac) {
            objeto.mostraDados();
        }
    }
    //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
    public PacienteComPlano search(String cpf){
        PacienteComPlano c = null;
        for(PacienteComPlano objeto : this.vetPac){
            if(objeto.getCPF().equals(cpf)){
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método buscar já implementado
    public boolean remove(String cpf){
        PacienteComPlano c = this.search(cpf);
        if(c!=null){
            this.vetPac.remove(c);
            return true;
        }else{
            return false;
        }
    }

    public void writeBinary() {
        FileOutputStream fileWriter = null;
        ObjectOutputStream ObjWriter = null;
        try {
            fileWriter = new FileOutputStream("Binary");
            ObjWriter = new ObjectOutputStream(fileWriter);
            ObjWriter.writeObject("\n       Persistencia em Binario:\n\n");
            for(Paciente pac : vetPac) {
                int i = 0;
                ObjWriter.writeObject("\nPaciente nro " + (i+1) + ":\n");
                ObjWriter.writeObject("\nNome do Paciente: " + vetPac.get(i).getNome());
                ObjWriter.writeObject("\nNascimento do Paciente: " + vetPac.get(i).getData_nascimento());
                ObjWriter.writeObject("\nCPF do Paciente: " + vetPac.get(i).getCPF());
                ObjWriter.writeObject("\nRG do Paciente: " + vetPac.get(i).getRG());
                ObjWriter.writeObject("\nEndereco: " + vetPac.get(i).getEndereco());
                ObjWriter.writeObject("\nSexo: " + vetPac.get(i).getSexo());
                ObjWriter.writeObject("\nEStado Civil: " + vetPac.get(i).getEstado_civil());
                ObjWriter.writeObject("\nData de cadastro no sistema: " + vetPac.get(i).getData_cadastro());
                ObjWriter.writeObject("\nData da Ultima Consulta: " + vetPac.get(i).getUltima_consulta());
                ObjWriter.writeObject("\nPlano Ativo: " + vetPac.get(i).getPlanoAtivo());
                ObjWriter.writeObject("\nNro da Carteirinha: " + vetPac.get(i).getNroCarteirinha());
                ObjWriter.writeObject("\nData do inrgresso: " + vetPac.get(i).getDataIngresso());
                ObjWriter.writeObject("\nEsta em periodo de carencia? ");
                if(vetPac.get(i).getCarencia())
                    ObjWriter.writeObject("Sim\n");
                else
                    ObjWriter.writeObject("Nao\n");
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
