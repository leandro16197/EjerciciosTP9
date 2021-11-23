package Noticia.Filtro;

import Noticia.Noticia;

public class FiltroLargoTexto implements Filtro{
    private int tam;

    public FiltroLargoTexto(int tam) {
        this.tam = tam;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.tamTexto()>tam;
    }
}
