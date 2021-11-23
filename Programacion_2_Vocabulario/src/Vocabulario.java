import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Vocabulario {
    private String texto;
    private ArrayList<Palabra>palabras;
    public Vocabulario(String texto){
        this.texto=texto;
        this.palabras=new ArrayList();
        String [] aux=texto.split(" ");
        for(int i=0;i<aux.length;i++){
            Palabra p1=new Palabra(aux[i]);
            this.addPalabra(p1);
        }
    }
    public int cantPalabras(){
       return this.palabras.size();
    }
    public void addPalabra(Palabra p1){
        if(!this.palabras.contains(p1)){
            this.palabras.add(p1);
        }else {
            for(int i=0;i<this.palabras.size();i++){
                this.palabras.get(i).incrementar();
            }
        }
    }
    public ArrayList getCopia(){
        return new ArrayList(this.palabras);
    }
    public ArrayList getFrecuenciaOrdena(){
        ArrayList aux=new ArrayList();
        aux=this.getCopia();
       Collections.sort(aux);
       return aux;
    }

    public ArrayList getPalabrasFrecuentes(int cant){
        int cont=0 ,i=0;
        ArrayList aux=new ArrayList();
        ArrayList total=this.getFrecuenciaOrdena();
        while(cont<cant && i<total.size()){
            aux.add(total.get(i));
            i++;
            cont++;
        }
        return aux;
    }
    public ArrayList getPalabrasMenosFrecuentes(int cant){
        int cont=0 ,i=0;
        ArrayList aux=new ArrayList();
        ArrayList total=this.getFrecuenciaOrdena();
        Collections.reverse(total);
        while(cont<cant && i<total.size()){
            aux.add(total.get(i));
            i++;
            cont++;
        }
        return aux;

    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void getOcurrencia(){
        for(int i=0;i<this.palabras.size();i++){
           System.out.println(" se repite"+this.palabras.get(i).getPalabra()+" " +this.palabras.get(i).getCant());
        }
    }
   public ArrayList ordenPalabra(){
        ArrayList aux=new ArrayList();
        aux=this.getCopia();
        Collections.sort(aux);
        return aux;
   }
}
