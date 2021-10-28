package TrabalhoPOOI;

import java.io.*;

public class escrita {
    public static boolean write(Object a, String file) {
        try {
            //Gera o arquivo para armazenar os objetos
            FileOutputStream FileW = new FileOutputStream(file);
            //Classe responsavel por inserir os objetos
            ObjectOutputStream ObjW = new
                    ObjectOutputStream(FileW);
            //Grava o objeto cliente no arquivo
            ObjW.writeObject(a);
            ObjW.flush();
            ObjW.close();
            FileW.flush();
            FileW.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}