package TrabalhoPOOI;

import java.io.*;
import java.util.ArrayList;

public class DadosConsulta implements Serializable {
    private static ArrayList<Consulta> vetConsulta = new ArrayList<Consulta>();

    public static void cadastra(Consulta c){
        vetConsulta.add(c);//ADICIONA O PACIENTE NO ARRAY
        System.out.println("Total de pacientes:");
        System.out.println(vetConsulta.size());
    }

    public static void list(){
        for(Consulta objeto : vetConsulta) {
            objeto.mostraDados();
        }
    }
    //este método retorna o objeto Consulta caso encontrado, ou null, caso não encontrado
    public static Consulta search(String cpf){
        Consulta c = null;
        for(Consulta objeto : vetConsulta){
            if(objeto.getPaciente().getCPF().equals(cpf)){
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método search já implementado
    public static boolean remove(String cpf){
        Consulta c = search(cpf);
        if(c!=null){
            vetConsulta.remove(c);
            return true;
        }else{
            return false;
        }
    }
    
    public void write() {
    	for(Consulta consulta : this.vetConsulta) {
    		Persist.write(consulta, "dadosConsultas");
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
                ObjWriter.writeObject("\nNome do Paciente: " + vetConsulta.get(i).getPaciente().getNome());
                ObjWriter.writeObject("\nCPF do Paciente: " + vetConsulta.get(i).getPaciente().getCPF());
                ObjWriter.writeObject("\nNome do Medico que realizara a Consulta: " + vetConsulta.get(i).getMedico().getNome());
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
