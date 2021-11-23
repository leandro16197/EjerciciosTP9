import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String tipo;
    private int agua;
    private int sol;
    private ArrayList <String> nombresVulgares;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String tipo, int agua, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.tipo = tipo;
        this.agua = agua;
        this.sol = sol;
        this.nombresVulgares=new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getSol() {
        return sol;
    }

    public ArrayList getNombres(){
        return new ArrayList(this.nombresVulgares);
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public void addNombreVulgar(String nVulgar){
        this.nombresVulgares.add(nVulgar);
    }

}
