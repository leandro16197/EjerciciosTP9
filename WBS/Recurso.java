package WBS;

import java.time.LocalDate;
import java.util.Objects;

public class Recurso {
    private String nombre;
    private Tarea tarea;
    private LocalDate fecha;

    public Recurso(String nombre, Tarea tarea, LocalDate fecha) {
        this.nombre = nombre;
        this.tarea = tarea;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    @Override
    public boolean equals(Object o) {
        Recurso r=(Recurso)o;
        return this.getNombre().equals(r.getNombre());
    }

}
