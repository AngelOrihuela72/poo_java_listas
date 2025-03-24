
package aireacondicionadolistamvc;

public class modeloControlAire {

    private boolean encendido;

    public modeloControlAire() {
        this.encendido = false;
    }

    public void controlar(double temperatura, double humedad) {
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}

