
package calculartempelistamvc;


public class ModeloVentilador {
    private boolean encendido;

    public ModeloVentilador() {
        this.encendido = false;
    }

    public void controlar(double temperatura) {
        if (temperatura > 25) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
