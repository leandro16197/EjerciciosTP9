public class OrCombinacion implements  Organisar{
    private Organisar organisar1;
    private Organisar organisar2;

    public OrCombinacion(Organisar organisar1, Organisar organisar2) {
        this.organisar1 = organisar1;
        this.organisar2 = organisar2;
    }

    @Override
    public boolean cumple(Documento doc) {
        return organisar1.cumple(doc)&& organisar2.cumple(doc);
    }
}
