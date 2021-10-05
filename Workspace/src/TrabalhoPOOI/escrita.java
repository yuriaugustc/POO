package TrabalhoPOOI;

import java.io.*;

public class escrita implements Serializable {
    public static void gravar(String texto) {
    BufferedWriter escreve = null;

        try{
            escreve = new BufferedWriter(
                            new FileWriter(
                                    new File ("DadosFuncionario")));
            escreve.write(texto);
            escreve.flush();
            escreve.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}