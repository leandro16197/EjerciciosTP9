package Noticia.Filtro;

import Noticia.Noticia;

public class FiltroPalabraClave implements Filtro{
    private String palabra;

    public FiltroPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.contiene(palabra);
    }
}
