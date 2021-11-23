public class ComClacificacion implements Comportamiento{
    private String clasificacion;

    public ComClacificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean criterio(Planta planta) {
        return planta.getNombreCientifico()==this.getClasificacion();
    }
}
