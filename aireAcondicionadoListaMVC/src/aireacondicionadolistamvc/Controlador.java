
package aireacondicionadolistamvc;


public class Controlador {
    private modeloSensorTemperatura sensorTemperatura;
    private modeloSensorHumedad sensorHumedad;
    private modeloControlAire controlAire;
    private Vista vista;

    public Controlador(modeloSensorTemperatura sensorTemperatura, modeloSensorHumedad sensorHumedad, modeloControlAire controlAire, Vista vista) {
        this.sensorTemperatura = sensorTemperatura;
        this.sensorHumedad = sensorHumedad;
        this.controlAire = controlAire;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            sensorTemperatura.actualizarTemperatura();
            sensorHumedad.actualizarHumedad();

            double temperatura = sensorTemperatura.getTemperatura();
            double humedad = sensorHumedad.getHumedad();

            controlAire.controlar(temperatura, humedad);
            boolean aireEncendido = controlAire.isEncendido();

            vista.mostrarEstado(temperatura, humedad, aireEncendido);

            try {
                Thread.sleep(10000); // Pausa de 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

