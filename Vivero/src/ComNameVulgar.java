public class ComNameVulgar implements Comportamiento{
    private String nombreVulgar;

    public ComNameVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean criterio(Planta planta) {
        return planta.getNombres().contains(this.getNombreVulgar());
    }
}
