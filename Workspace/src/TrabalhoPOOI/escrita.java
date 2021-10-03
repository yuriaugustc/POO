package TrabalhoPOOI;

import java.io.*;

public class escrita implements Serializable {
    BufferedWriter escreve = null;

    try{
        escreve = new BufferedWriter(
                        new FileWriter(
                                new File ("DadosFuncionaro")));
        escreve.write(texto);
        escreve.flush();
        escreve.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}