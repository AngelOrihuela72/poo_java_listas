
package calculartempelistamvc;


public class ModeloCalefactor {
    private boolean encendido;

    public ModeloCalefactor() {
        this.encendido = false;
    }

    public void controlar(double temperatura) {
        if (temperatura < 10) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
