package WBS;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends Tarea {
    private ArrayList<Recurso>recursos;
    private LocalDate fechaEstiFin;
    private LocalDate fechaEstiIni;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String estado;

    public TareaTerminal(LocalDate fechaEstiFin, LocalDate fechaEstiIni, LocalDate fechaIni, LocalDate fechaFin, String estado) {
        this.fechaEstiFin = fechaEstiFin;
        this.fechaEstiIni = fechaEstiIni;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.recursos=new ArrayList<>();
    }

    public LocalDate getFechaEstiFin() {
        return fechaEstiFin;
    }

    public void setFechaEstiFin(LocalDate fechaEstiFin) {
        this.fechaEstiFin = fechaEstiFin;
    }

    public LocalDate getFechaEstiIni() {
        return fechaEstiIni;
    }

    public void setFechaEstiIni(LocalDate fechaEstiIni) {
        this.fechaEstiIni = fechaEstiIni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void addRecurso(Recurso r){
        this.recursos.add(r);
    }
    public ArrayList<Recurso> getRecursos(){
        return new ArrayList<>(this.recursos);
    }

    @Override
    public LocalDate getFechaInicio() {
        return this.fechaIni;
    }

    @Override
    public LocalDate getFechaFin() {
        return this.fechaFin;
    }

    @Override
    public ArrayList<TareaTerminal> listar() {
        LocalDate hoy=LocalDate.now();
        ArrayList<TareaTerminal> aux=new ArrayList<>();
        if(hoy.compareTo(this.getFechaEstiFin())>1 && this.getEstado()=="en espera"){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public ArrayList<TareaTerminal> listaRecursos(Recurso r) {
        ArrayList<TareaTerminal> aux=new ArrayList<>();
        if(this.getRecursos().contains(r)){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public ArrayList<Recurso> listaTares(Tarea t) {
        ArrayList <Recurso> aux=new ArrayList<>();
        for(int i=0;i<this.recursos.size();i++){
            if(!aux.contains(this.recursos.get(i))){
                aux.add(this.recursos.get(i));
            }
        }
        return aux;
    }

    @Override
    public int duracion() {
        int resultado=this.getFechaEstiIni().getDayOfMonth()-this.getFechaEstiFin().getDayOfMonth();
        return resultado;
    }
}
