public class OrNoPalabraClave implements Organisar{
    private String palabra;

    public OrNoPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento doc) {
        if(!doc.contienePalabra(palabra)){
            return true;
        }
        return false;
    }
}
