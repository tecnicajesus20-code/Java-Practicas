public class S05ReservaSala {
    // TODO 1: Declarar cliente (String), horas (int) y tarifaPorHora (long) privados.
    private String cliente ;
    private  int horas;
    private long tarifaPorHoras;

    public S05ReservaSala(String cliente, int horas, long tarifaPorHora) {
        // TODO 2: Inicializar los tres campos con los parametros.
        this.horas = horas;
        this.tarifaPorHoras = tarifaPorHora;
        this.cliente = cliente;
    }

    public String obtenerCliente() {
        // TODO 3: Devolver el cliente.
        return cliente; // Retorno provisional: reemplazar.
    }

    public int obtenerHoras() {
        // TODO 4: Devolver las horas actuales.
        return horas; // Retorno provisional: reemplazar.
    }

    public long calcularCosto() {
        // TODO 5: Devolver horas por tarifaPorHora.
        return this.tarifaPorHoras * this.horas ; // Retorno provisional: reemplazar.
    }

    public boolean extender(int horasAdicionales) {
        // TODO 6: Aceptar solo de 1 a 8 - horas; actualizar si acepta y devolver el resultado.
        // Retorno provisional: reemplazar.
        return horasAdicionales <= 8 && horasAdicionales > 0;

    }
}
