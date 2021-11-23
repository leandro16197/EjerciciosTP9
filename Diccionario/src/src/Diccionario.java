package src;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {
    private String nombre;
    private ArrayList <Palabra> palabras;

    public Diccionario(String nombre) {
        this.nombre = nombre;
        this.palabras=new ArrayList<>();
    }

    public void addPalabra(Palabra palabra){
        if(!this.palabras.contains(palabra)){
                 this.palabras.add(palabra);
         }
        Collections.sort(this.palabras);
    }

    public  Boolean deletePalabra(Palabra palabra){
        return this.palabras.remove(palabra);
    }

    public void modPalabra(Palabra palabra ,Palabra palabra2){
        int i =0;
        while(this.palabras.size()>i){
            if(this.palabras.get(i).equals(palabra)){
                this.palabras.add(i,palabra2);
            }
            i++;
        }
    }
    public ArrayList getListaSinonimos(Palabra p1){
        ArrayList aux=new ArrayList();
        aux.addAll(p1.getSinonimos());
        Collections.sort(aux);
       return aux ;
    }
    public ArrayList getListaAntonimos(Palabra p1){
        ArrayList aux=new ArrayList();
        aux.addAll(p1.getAntonimo());
        Collections.sort(aux);
        return aux ;
    }
    public ArrayList getListaDefinicion(Palabra p1){
        ArrayList aux=new ArrayList();
        aux.addAll(p1.getDefinicion());
        Collections.sort(aux);
        return aux ;
    }

}
