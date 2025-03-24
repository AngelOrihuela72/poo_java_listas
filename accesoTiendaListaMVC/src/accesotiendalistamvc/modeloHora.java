
package accesotiendalistamvc;

import java.time.LocalTime;


public class modeloHora {
    public LocalTime obtenerHoraActual() {
        return LocalTime.now();
    }

    public boolean estaDentroHorarioAtencion() {
        LocalTime horaActual = obtenerHoraActual();
        return (horaActual.isAfter(LocalTime.of(9, 0)) && horaActual.isBefore(LocalTime.of(18, 0)));
    }
}
