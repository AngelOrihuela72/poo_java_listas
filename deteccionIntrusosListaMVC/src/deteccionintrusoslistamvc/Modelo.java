
package deteccionintrusoslistamvc;


public class Modelo {

    public static boolean activarAlarma(boolean[] sensores, boolean noche) {
        int sensoresActivados = 0;


        for (boolean sensor : sensores) {
            if (sensor) {
                sensoresActivados++;
            }
        }

        return sensoresActivados >= 2 && noche;
    }
}
