package Noticia.Filtro;

import Noticia.Noticia;

public class FiltroAutor implements Filtro{
    private String autor;

    public FiltroAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getNombreAutor().equals(autor);
    }
}
