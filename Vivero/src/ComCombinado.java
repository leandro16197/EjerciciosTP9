public class ComCombinado implements Comportamiento{
    private Comportamiento comp1;
    private Comportamiento comp2;

    public ComCombinado(Comportamiento comp1, Comportamiento comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public Comportamiento getComp1() {
        return comp1;
    }

    public void setComp1(Comportamiento comp1) {
        this.comp1 = comp1;
    }

    public Comportamiento getComp2() {
        return comp2;
    }

    public void setComp2(Comportamiento comp2) {
        this.comp2 = comp2;
    }

    @Override
    public boolean criterio(Planta planta) {
        return ((this.getComp1().criterio(planta)) && (this.getComp2().criterio(planta)));
    }
}
