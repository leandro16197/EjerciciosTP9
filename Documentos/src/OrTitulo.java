public class OrTitulo implements Organisar {
    private String titulo;

    public OrTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public boolean cumple(Documento doc) {
        if(doc.getTitulo().equals(this.getTitulo())){
            return true;
        }
        return false;
    }
}
