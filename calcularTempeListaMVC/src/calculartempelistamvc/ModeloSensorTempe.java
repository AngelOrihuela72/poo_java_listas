
package calculartempelistamvc;


public class ModeloSensorTempe {
     private double temperatura;

    public ModeloSensorTempe(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    public void actualizarTemperatura() {
        temperatura += Math.random() - 0.5; 
    }

    public double obtenerTemperatura() {
        return temperatura;
    }
}
