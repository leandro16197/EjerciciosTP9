import java.lang.reflect.Array;
import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contTextual;
    private ArrayList<String>palabrasClabes;
    private ArrayList <String>autores;

    public Documento(String titulo, String contTextual) {
        this.titulo = titulo;
        this.contTextual = contTextual;
        this.palabrasClabes=new ArrayList<>();
        this.autores=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContTextual() {
        return contTextual;
    }

    public void setContTextual(String contTextual) {
        this.contTextual = contTextual;
    }
    public boolean contieneAutor(String autor){
        return this.titulo.contains(autor);
    }
    public boolean contienePalabra(String palabra){
       return this.palabrasClabes.contains(palabra);
    }
    public boolean contenidoGeneral(String frase){
        if(this.getContTextual()==frase){
            return true;
        }
        return false;
    }
    public int contMin(){
        String [] texto=this.getContTextual().split(" ");
      return texto.length;
    }
}
