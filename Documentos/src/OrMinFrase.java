public class OrMinFrase implements Organisar{
    private int cant;

    public OrMinFrase(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int frase) {
        this.cant = cant;
    }

    @Override
    public boolean cumple(Documento doc) {
        if(doc.contMin()>=this.getCant()){
            return true;
        }
        return false;
    }
}
