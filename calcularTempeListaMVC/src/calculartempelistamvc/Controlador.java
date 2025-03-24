
package calculartempelistamvc;


public class Controlador {
     private ModeloSensorTempe sensorTemperatura;
    private ModeloCalefactor calefactor;
    private ModeloVentilador ventilador;
    private Vista vista;

    public Controlador(ModeloSensorTempe sensorTemperatura, ModeloCalefactor calefactor, ModeloVentilador ventilador, Vista vista) {
        this.sensorTemperatura = sensorTemperatura;
        this.calefactor = calefactor;
        this.ventilador = ventilador;
        this.vista = vista;
    }

    public void ejecutar() {
        while (true) {
            sensorTemperatura.actualizarTemperatura();
            double temperatura = sensorTemperatura.obtenerTemperatura();

            vista.mostrarTemperatura(temperatura);

            calefactor.controlar(temperatura);
            ventilador.controlar(temperatura);

            vista.mostrarEstadoCalefactor(calefactor.isEncendido());
            vista.mostrarEstadoVentilador(ventilador.isEncendido());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
