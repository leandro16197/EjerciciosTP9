public class Palabra implements Comparable<Palabra>{
    private String palabra;
    private int cant;

    public Palabra(String palabra) {
        this.palabra = palabra;
        this.cant=1;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    public boolean equals(Object o){
        Palabra p1=(Palabra) o;
        return this.palabra.equals(p1.getPalabra());
    }

    public void incrementar() {
        this.setPalabra(this.getPalabra()+1);
    }

    @Override
    public int compareTo(Palabra palabra) {
        return this.getCant()-palabra.getCant();
    }
}
