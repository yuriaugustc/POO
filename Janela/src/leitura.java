
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;

	public class leitura implements Serializable {
	    String line;
	    BufferedReader file;
	    try {
	        file = new BufferedReader(
	                    new FileReader(
	                        new File ("DadosFuncionarios")));
	        while((line = file.readLine()) != null){

	        }
	        file.close();
	    } catch (java.io.IOException e)  {
	        System.out.println("File error: " + e.toString());
	    }
}
	}