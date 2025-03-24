package aireacondicionadolistamvc;

public class Main {
    public static void main(String[] args) {
        modeloSensorTemperatura sensorTemperatura = new modeloSensorTemperatura(25.0); // Temperatura inicial de 25°C
        modeloSensorHumedad sensorHumedad = new modeloSensorHumedad(50.0); // Humedad inicial del 50%
        modeloControlAire controlAire = new modeloControlAire();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sensorTemperatura, sensorHumedad, controlAire, vista);

        controlador.iniciar();
    }
}
