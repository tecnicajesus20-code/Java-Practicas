package s07lab01;

public class S07Lab01UmlMain {
    public static void main(String[] args) {
        TramitePresencial tramite = new TramitePresencial("T-01");
        Tramite tramite2 = new Tramite("T-02");
        Tramite tramite3 = new TramitePresencial("T-03");
        Validador validador = new Validador();
        System.out.println(tramite.descripcion());
        System.out.println(tramite.verificar(validador));
        System.out.println(tramite2.descripcion());
        System.out.println(tramite.verificar(validador));
        System.out.println(tramite3.descripcion());
        System.out.println(tramite.verificar(validador));
    }
}
