package src;

import java.util.ArrayList;

public class Palabra implements Comparable<Palabra> {
    private String palabra;
    private String funcion;
    private ArrayList <String> difinicion;
    private ArrayList <String>  sinonimos;
    private ArrayList <String>  antonimos;

    public Palabra(String palabra,String funcion) {
        this.funcion = funcion;
        this.palabra=palabra;
        this.difinicion=new ArrayList();
        this.antonimos=new ArrayList();
        this.sinonimos=new ArrayList();

    }
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {

        this.funcion = funcion;
    }
    public void setDifinicion(String definicion){
        this.difinicion.add(definicion);
    }
    public void setSinonimos(String sinonimo){
        this.sinonimos.add(sinonimo);
    }
    public void setAntonimos(String antonimo){
        this.antonimos.add(antonimo);
    }
    public ArrayList getAntonimo(){
        return new ArrayList(this.antonimos);
    }
    public ArrayList getSinonimos(){
        return new ArrayList(this.sinonimos);
    }
    public ArrayList getDefinicion(){
        return new ArrayList(this.difinicion);
    }
    public boolean equals(Object o){
        Palabra p1=(Palabra) o;
        return this.getPalabra().equals(p1.getPalabra());
    }

    @Override
    public int compareTo(Palabra p1) {
        return this.getPalabra().compareTo(p1.getPalabra());
    }
}
