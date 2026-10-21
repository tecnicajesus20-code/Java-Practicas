public class S05Lab03ReservaSala {
    public static void main(String[] args) {
        // TODO 7: Crear reservaAna (2 horas, 15000 pesos/hora) y reservaLuis (1, 20000).
        S05ReservaSala reservaAna = new S05ReservaSala("ana", 2 , 15000);
        S05ReservaSala reservaluis = new S05ReservaSala("Luis", 1 , 20000);

        // TODO 8: Mostrar los resultados de extender la reserva de Ana en 1, 6 y 0 horas.

        System.out.println("La extencion de la reserva" + ((reservaAna.extender(1))?" fue exitosa":" no se realizo"));
        System.out.println("La extencion de la reserva" + ((reservaAna.extender(6))?" fue exitosa":" no se realizo"));
        System.out.println("La extencion de la reserva" + ((reservaAna.extender(0))?" fue exitosa":" no se realizo"));
        System.out.println("La extencion de la reserva" + ((reservaAna.extender(9))?" fue exitosa":" no se realizo"));

        // TODO 9: Mostrar cliente, horas y costo final de ambas reservas.
        System.out.println("============= Primer cliente ========");
        System.out.println("|cliente : " + (reservaAna.obtenerCliente())+ "|");
        System.out.println("|costo final : " + (reservaAna.calcularCosto())+ "|");
        System.out.println("|horas : " + (reservaAna.obtenerHoras())+ "|");
        System.out.println("============= Segundo cliente ========");
        System.out.println("|cliente : " + (reservaluis.obtenerCliente())+ "|");
        System.out.println("|costo final : " + (reservaluis.calcularCosto())+ "|");
        System.out.println("|horas : " + (reservaluis.obtenerHoras())+ "|");
    }
}
