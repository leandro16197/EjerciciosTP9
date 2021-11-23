package Noticia;

import Noticia.Filtro.Filtro;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class ElementoAbs {
    private String nombre;

    public ElementoAbs(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getCantNoticia();
    public abstract ArrayList getBuscar(Filtro f);
    public abstract ArrayList<String> ruta();
}
