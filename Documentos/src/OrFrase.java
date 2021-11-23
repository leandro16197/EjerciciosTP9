

public class OrFrase implements Organisar {
    private String frase;

    public OrFrase(String frase) {
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
        if(doc.getContTextual().contains(this.getFrase())){
            return true;
        }
        return false;
    }
}
