public class OrContenido implements Organisar{
    private String frase;

    public OrContenido(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Documento doc) {
        if(doc.contenidoGeneral(this.getFrase())){
            return true;
        }
        return false;
    }
}
