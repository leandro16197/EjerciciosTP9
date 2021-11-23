import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vivero {
    private String nombre;
    private ArrayList <Planta>plantas;

    public Vivero(String nombre) {
        this.nombre = nombre;
        this.plantas=new ArrayList<>();
    }

    public  ArrayList getPlanta(Comportamiento comportaminento, Comparator<Planta> ordenamiento){
        ArrayList<Planta>listaPlanta=new ArrayList<>();
        for (int i=0;i<this.plantas.size();i++){
            if(comportaminento.criterio(this.plantas.get(i))){
                listaPlanta.add(this.plantas.get(i));
            }
        }
        return listaPlanta;
    }

}
