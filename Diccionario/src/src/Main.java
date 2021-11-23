package src;

public class Main {

    public static void main(String[] args) {
        Palabra p1=new Palabra("Hola","saludar" );
        System.out.println(p1);
        Diccionario d1=new Diccionario("diccionario");
        p1.setSinonimos("asd");
        d1.addPalabra(p1);
        d1.getListaAntonimos(p1);
    }

}
