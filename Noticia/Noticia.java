package Noticia;

import Noticia.Filtro.Filtro;

import java.util.ArrayList;

public class Noticia extends ElementoAbs{
    private String titulo;
    private String introduccion;
    private String texto;
    private String nombreAutor;
    private String link;
    private ArrayList<String> palabrasClave;

    public Noticia(String nombre, String titulo, String introduccion, String texto, String nombreAutor, String link) {
        super(nombre);
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.nombreAutor = nombreAutor;
        this.link = link;
        this.palabrasClave=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public void addPalabra(String palabra){
        this.palabrasClave.add(palabra);
    }
    public ArrayList getPalabras(){
        return new ArrayList(this.palabrasClave);
    }


    @Override
    public int getCantNoticia() {
        return 1;
    }

    @Override
    public ArrayList getBuscar(Filtro f) {
        ArrayList aux=new ArrayList();
        if(f.cumple(this)){
            aux.add(this);
        }
        return aux;
    }
    public int tamTexto(){
        String[]array=this.texto.split(" ");
        return array.length;
    }

    @Override
    public ArrayList<String> ruta() {
        ArrayList aux=new ArrayList();
        aux.add(this.getLink());
        return aux;
    }

    public boolean contiene(String palabra) {
        return this.palabrasClave.contains(palabra);
    }
}
