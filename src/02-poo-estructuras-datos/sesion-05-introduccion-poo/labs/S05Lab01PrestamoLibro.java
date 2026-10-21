public class S05Lab01PrestamoLibro {

    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda.
        System.out.println("========== TODO 7 =============");
        S05LibroPrestamo primerLibro = new S05LibroPrestamo("El principito");
        S05LibroPrestamo segundoLibro = new S05LibroPrestamo("Matilda");

        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println("========== TODO 8 =============");
        System.out.println("Primer libro : " + primerLibro.obtenerTitulo());
        System.out.println("Segundo libro : " + primerLibro.obtenerTitulo());
        primerLibro.prestar();
        System.out.println("Segundo intento");
        primerLibro.prestar();
        System.out.println("Estado: " + primerLibro.estaPrestado());

        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.
        System.out.println("========== TODO 9 =============");
        primerLibro.devolver();
        segundoLibro.devolver();
        primerLibro.estaPrestado();
        segundoLibro.estaPrestado();

    }


}
