import java.util.Comparator;

public abstract class Ordenamiento implements Comparator<Planta> {
    @Override
    public abstract int compare(Planta p1, Planta p2);
}
