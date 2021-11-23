package Noticia;

import Noticia.Filtro.Filtro;

import java.util.ArrayList;

public class Categoria extends ElementoAbs{
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private ArrayList<ElementoAbs>seccions;

    public Categoria(String nombre, String descripcion, String urlImagen, String nombre1, String descripcion1, String urlImagen1) {
        super(nombre);
        this.nombre = nombre1;
        this.descripcion = descripcion1;
        this.urlImagen = urlImagen1;
        this.seccions=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public void addSeccion(ElementoAbs e){
        this.seccions.add(e);
    }
    public ArrayList getSecciones(){
        return new ArrayList(this.seccions);
    }
    public int cantSecciones(){
        return this.seccions.size();
    }

    @Override
    public int getCantNoticia() {
        int total=0;
        for(int i=0;i<this.seccions.size();i++){
            total+=this.seccions.get(i).getCantNoticia();
        }
        return total;
    }
    @Override
    public ArrayList getBuscar(Filtro f){
        ArrayList aux=new ArrayList();
        for(ElementoAbs e: seccions){
            aux.addAll(e.getBuscar(f));
        }

        return aux;
    }
    @Override
    public ArrayList<String> ruta(){
        String raiz=this.getDescripcion();
        ArrayList<String> aux=new ArrayList();

        for(ElementoAbs e:seccions){
            aux.addAll(e.ruta());
        }
        ArrayList<String> aux2=new ArrayList();
        aux2.add(raiz);

       for(String elemento : aux){
           aux2.add(raiz+"/"+elemento);
       }
        return aux2;
    }
}
