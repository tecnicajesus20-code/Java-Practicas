public class S05Lab02MedidasRectangulo {
    public static void main(String[] args) {
        // TODO 6: Crear primeraFigura de 5 por 3 y segundaFigura de 4 por 4.
        S05Rectangulo primeraFigura = new S05Rectangulo(5 , 3);
        S05Rectangulo segundaFigura = new S05Rectangulo(4 , 4);
        // TODO 7: Mostrar area, perimetro y esCuadrado de cada figura.
        System.out.println("____________________ Triangulos _______________________");
        System.out.println("Area triangulo 1 : " + primeraFigura.calcularArea());
        System.out.println("Area triangulo 2 : "+ segundaFigura.calcularArea());
        System.out.println("Perimetro triangulo 1 : " + primeraFigura.calcularPerimetro());
        System.out.println("Perimetro triangulo 2 : " + segundaFigura.calcularPerimetro());
        System.out.println("El triangulo 1 "+ ((primeraFigura.esCuadrado())? "Es cuadrado":"no es un cuadrado"));
        System.out.println("El triangulo 2 "+ ((segundaFigura.esCuadrado())? "Es cuadrado":"no es un cuadrado"));


    }
}
