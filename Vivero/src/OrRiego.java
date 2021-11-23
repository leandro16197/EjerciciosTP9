public class OrRiego extends Ordenamiento{
    private Ordenamiento ordenamiento;

    public OrRiego(Ordenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public Ordenamiento getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(Ordenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    @Override
    public int compare(Planta p1, Planta p2) {
        int resultado=p1.getAgua()- p2.getAgua();
        if(resultado==0){
            return this.getOrdenamiento().compare(p1,p2);
        }
        return resultado;
    }
}
