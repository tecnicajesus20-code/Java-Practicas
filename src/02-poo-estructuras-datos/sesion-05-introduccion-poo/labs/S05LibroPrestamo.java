public class S05LibroPrestamo {

    // TODO 1: Declarar titulo (String) y prestado (boolean) como campos privados.
    private String titulo;
    private boolean prestado;
    public S05LibroPrestamo(String titulo) {
        // TODO 2: Guardar el titulo y establecer prestado en false.
        this.titulo = titulo;
    }
    public String obtenerTitulo() {
        // TODO 3: Devolver el titulo del objeto.
        return titulo; // Retorno provisional: reemplazar.
    }

    public boolean prestar() {
        // TODO 4: Rechazar un segundo prestamo; si esta disponible, prestarlo.
        if (!prestado){
            prestado = true ;
            System.out.println("Prestamo Realizado con exito");
        }
        else {
            System.out.println("No se puede prestar este libro, por que ya fue prestado");
        }
        return prestado ;
    }

    public void devolver() {
        // TODO 5: Marcar el libro como no prestado.
        if(prestado){
            prestado = false;
            System.out.println("Libro devuelto exitosamente");
        }
        else {
            System.out.println("Este libro no se puede devolver por que no esta prestado");
        }
    }

    public boolean estaPrestado() {
        // TODO 6: Devolver el estado prestado del objeto.
        System.out.println("Este libro " + ((!prestado)? "no ha sido prestado ": (prestado)? "ya fue prestado":"xd"));
        return prestado; // Retorno provisional: reemplazar.
    }
}
