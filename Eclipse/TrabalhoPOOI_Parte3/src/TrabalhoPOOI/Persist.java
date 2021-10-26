package TrabalhoPOOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
	public static boolean write(Object a, String arquivo){
		try{ //Gera o arquivo para armazenar os objetos 
			FileOutputStream arquivoGrav = new FileOutputStream(arquivo);
			//Classe responsavel por inserir os objetos 
			ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
			//Grava o objeto cliente no arquivo 
			objGravar.writeObject(a);
			objGravar.flush();
			objGravar.close();
			arquivoGrav.flush();
			arquivoGrav.close();
			return true;
			}
		catch(Exception e){
			return false;
			}
	}
	
	public static Object recovery(String arquivo){
		Object obj = null;
		FileInputStream arquivoLeitura = null;
		ObjectInputStream objLeitura = null;
		try{//Carrega o arquivo 
			arquivoLeitura = new FileInputStream(arquivo);
			//Classe responsavel por recuperar os objetos do arquivo
			objLeitura = new ObjectInputStream(arquivoLeitura);
			//Le o objeto
			obj = objLeitura.readObject();
			objLeitura.close();
			arquivoLeitura.close();
			}
		catch(Exception e){
			return null;
			}
		return obj;
	}
}
