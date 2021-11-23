public class OrPalabraClave implements  Organisar{
    private String palabra;

    public OrPalabraClave(String palabra) {
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
        if(doc.contienePalabra(this.getPalabra())){
            return true;
        }
        return false;
    }
}
