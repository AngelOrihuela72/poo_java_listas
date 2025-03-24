
package calculartempelistamvc;


public class Main {

public static void main(String[] args) {
        ModeloSensorTempe sensorTemperatura = new ModeloSensorTempe(15.0); 
        ModeloCalefactor calefactor = new ModeloCalefactor();
        ModeloVentilador ventilador = new ModeloVentilador();
        Vista vista = new Vista();

        Controlador controlador = new Controlador(sensorTemperatura, calefactor, ventilador, vista);
        controlador.ejecutar();
    }
}
    

