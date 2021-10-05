package TrabalhoPOOI;

import java.io.*;

public class leitura implements Serializable {
    public static void ler() {
        String line;
        BufferedReader file = null;
        try {
            file = new BufferedReader(
                    new FileReader(
                            new File("DadosFuncionarios")));
            while ((line = file.readLine()) != null) {

            }
            file.close();
        } catch (IOException e){
            System.out.println("File error: " + e.toString());
        }
    }
}
