public class ComNivelSupSol implements Comportamiento{
    private int max;
    private int min;

    public ComNivelSupSol(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public boolean criterio(Planta planta) {
        return (planta.getSol()>this.getMax()&& planta.getAgua()<this.getMin());
    }
}
