public class OrAutor implements Organisar{
    private String autor;

    public OrAutor(String autor){
        this.autor=autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento doc) {
        if(doc.contieneAutor(this.getAutor())){
            return true;
        }
        return false;
    }
}
