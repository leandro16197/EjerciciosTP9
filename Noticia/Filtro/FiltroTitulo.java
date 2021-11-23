package Noticia.Filtro;

import Noticia.Noticia;

public class FiltroTitulo implements Filtro{
    private String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(titulo);
    }
}
