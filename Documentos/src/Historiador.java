import java.lang.reflect.Array;
import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento>documentos;

    public Historiador(String nombre) {
        this.nombre = nombre;
        this.documentos=new ArrayList<>();
    }

    public ArrayList getDocumentos(Organisar or){
        ArrayList aux=new ArrayList();
        for(int i=0;i<this.documentos.size();i++){
            if(or.cumple(this.documentos.get(i))){
                    aux.add(this.documentos.get(i));
            }
        }
        return aux;
    }
}
