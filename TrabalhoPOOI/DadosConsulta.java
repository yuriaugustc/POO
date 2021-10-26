package TrabalhoPOOI;

import java.io.*;
import java.util.ArrayList;

public class DadosConsulta implements Serializable {
    private ArrayList<Consulta> vetConsulta = new ArrayList<Consulta>();

    public void cadastra(Consulta c){
        this.vetConsulta.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de pacientes:");
        System.out.println(this.vetConsulta.size());
    }

    public void list(){
        for(Consulta objeto : this.vetConsulta) {
            objeto.mostraDados();
        }
    }
    //este método retorna o objeto Consulta caso encontrado, ou null, caso não encontrado
    public Consulta search(String cpf){
        Consulta c = null;
        for(Consulta objeto : this.vetConsulta){
            if(objeto.getCpfPaciente().equals(cpf)){
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método search já implementado
    public boolean remove(String cpf){
        Consulta c = this.search(cpf);
        if(c!=null){
            this.vetConsulta.remove(c);
            return true;
        }else{
            return false;
        }
    }
    public void writeBinary(){
        FileOutputStream fileWriter = null;
        ObjectOutputStream ObjWriter = null;
        try {
            fileWriter = new FileOutputStream("Binary");
            ObjWriter = new ObjectOutputStream(fileWriter);
            ObjWriter.writeObject("\n       Persistencia em Binario:\n\n");
            for(Consulta consulta : vetConsulta) {
                int i = 0;
                ObjWriter.writeObject("\nConsulta nro " + (i+1) + ":\n");
                ObjWriter.writeObject("\nNome do Paciente: " + vetConsulta.get(i).getNomePaciente());
                ObjWriter.writeObject("\nCPF do Paciente: " + vetConsulta.get(i).getCpfPaciente());
                ObjWriter.writeObject("\nNome do Médico que realizará a Consulta: " + vetConsulta.get(i).getNomeMedico());
                ObjWriter.writeObject("\nData da Consulta: " + vetConsulta.get(i).getDataConsulta());
                ObjWriter.writeObject("\nHora da Consulta: " + vetConsulta.get(i).getHoraConsulta());
                ObjWriter.writeObject("\nMedicamentos : ");
                for(int j = 0; j < vetConsulta.get(i).Medsize(); j++){
                    if(j+1 == vetConsulta.get(i).Medsize()){
                        ObjWriter.writeObject(vetConsulta.get(i).getMedicamentos(j));
                        break;
                    }
                    else
                        ObjWriter.writeObject(vetConsulta.get(i).getMedicamentos(j)+ ", ");
                }
                ObjWriter.writeObject("\nReceita: " + vetConsulta.get(i).getReceita());
                ObjWriter.writeObject("\nValor da Consulta: " + vetConsulta.get(i).getValorConsulta());
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
