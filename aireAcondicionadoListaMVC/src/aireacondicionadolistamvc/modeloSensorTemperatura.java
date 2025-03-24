
package aireacondicionadolistamvc;


public class modeloSensorTemperatura {

    private double temperatura;

    public modeloSensorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void actualizarTemperatura() {
        temperatura = 20 + Math.random() * 15;
    }
}
