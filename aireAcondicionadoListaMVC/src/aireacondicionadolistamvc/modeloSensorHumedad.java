
package aireacondicionadolistamvc;


public class modeloSensorHumedad {

    private double humedad;

    public modeloSensorHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getHumedad() {
        return humedad;
    }

    public void actualizarHumedad() {
        humedad = 40 + Math.random() * 40;
    }
}

