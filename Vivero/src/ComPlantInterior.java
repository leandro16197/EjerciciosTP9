public class ComPlantInterior implements  Comportamiento{
    private String tipo;
    private int nivelRiego;

    public ComPlantInterior(String tipo, int nivelRiego) {
        this.tipo = tipo;
        this.nivelRiego = nivelRiego;
    }

    public int getNivelRiego() {
        return nivelRiego;
    }

    public void setNivelRiego(int nivelRiego) {
        this.nivelRiego = nivelRiego;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean criterio(Planta planta) {
        return ((planta.getTipo()==this.getTipo()) && (planta.getAgua()<this.getNivelRiego()));
    }
}
