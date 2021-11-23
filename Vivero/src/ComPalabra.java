public class ComPalabra implements  Comportamiento{
    private String nombre;

    public ComPalabra(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean criterio(Planta planta) {
        String [] nombre=planta.getNombreCientifico().split(" ");
        for(int i=0;i< nombre.length;i++){
            if(nombre[i]==this.getNombre()){
                return true;
            }
        }
        return false;
    }
}
