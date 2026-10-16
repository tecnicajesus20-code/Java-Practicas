public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.

        // Debe tener 18 años o mas años. Tener membresia o invitacion y no estar bloqueado.


        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = edad >=  18 && ( esMiembro || tieneInvitacion ) && !bloqueado;
        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        if ()
        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
    }
}
