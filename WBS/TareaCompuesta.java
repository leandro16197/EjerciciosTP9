package WBS;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TareaCompuesta extends Tarea{
    private ArrayList<Tarea>tareas;

    public TareaCompuesta() {
        this.tareas=new ArrayList<>();
    }

    @Override
    public LocalDate getFechaInicio() {
        int i=0;
       return this.tareas.get(i).getFechaInicio();
    }

    @Override
    public LocalDate getFechaFin() {
        int i=0;
        Collections.reverse(this.tareas);
        return this.tareas.get(i).getFechaFin();
    }

    @Override
    public ArrayList<TareaTerminal> listar() {
        ArrayList<TareaTerminal>  aux=new ArrayList();
        for(Tarea e:tareas){
            aux.addAll(e.listar());
        }
        return aux;
    }

    @Override
    public ArrayList<TareaTerminal> listaRecursos(Recurso r) {
        ArrayList<TareaTerminal> aux=new ArrayList<>();
        for(Tarea e:tareas){
            aux.addAll(e.listaRecursos(r));
        }
        return aux;
    }

    @Override
    public ArrayList<Recurso> listaTares(Tarea t) {
        ArrayList<Recurso>aux=new ArrayList<>();
        for(Tarea e:tareas){
            aux.addAll(e.listaTares(t));
        }
        return aux;
    }

    @Override
    public int duracion() {
        int total=0;
        for(Tarea e:tareas){
            total+=e.duracion();
        }
        return total;
    }
}
