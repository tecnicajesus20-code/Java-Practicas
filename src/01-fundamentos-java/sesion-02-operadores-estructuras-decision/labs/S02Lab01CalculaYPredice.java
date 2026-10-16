package src;

public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        /*
            -- unidades + capacidad = 9
            -- unidades - capacidad = 5
            -- unidades * capacidad = 14
            -- unidades / capacidad = 3
            -- 7.0 / capacidad = 3.5
            -- unidades % capacidad = 1
            -- 2 + 3 * 4 = 14
            -- (2 + 3) * 4 = 20
         */
        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        System.out.println(unidades + capacidad);
        System.out.println(unidades - capacidad);
        System.out.println(unidades * capacidad);
        System.out.println(unidades / capacidad);
        System.out.println(7.0 / capacidad );


        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        System.out.println(unidades % capacidad);
        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println(2 + 3 * 4);
        System.out.println( (2 + 3) * 4);
        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        System.out.println("Aumentando...");
        for (t i = 0 , i > 5 , i++){
            System.out.println((i == 5 )? "MAXIMO: " + i : i);

            if (i == 5) {
                System.out.println("DECREMENTANDO ");
                for (i = 5 , i == 0 , i--){
                    System.out.println(i);
                }
            }
        }
        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.

        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        // -- no hay diferencia clara
    }
}
