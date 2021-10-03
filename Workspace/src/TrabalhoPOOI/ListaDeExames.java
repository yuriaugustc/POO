package TrabalhoPOOI;

import java.util.ArrayList;

public class ListaDeExames extends Exame{
    private ArrayList<Exame> lista;

    public ListaDeExames(Exame exame[]) {
        setListaDeExames(exame);
    }

    public void setListaDeExames(Exame exame[]) {
        for(int i = 0; i < exame.length; i++)
        lista.add(exame[i]);
    }

    public void setLista(ArrayList<Exame> lista) {
        this.lista = lista;
    }
}
