package WBS;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {
  public abstract LocalDate getFechaInicio();
  public abstract LocalDate getFechaFin();
  public abstract ArrayList<TareaTerminal> listar();
  public abstract ArrayList<TareaTerminal> listaRecursos(Recurso r);
  public abstract ArrayList<Recurso> listaTares(Tarea t);
  public abstract int duracion();
}
