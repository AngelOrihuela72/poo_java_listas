
package aireacondicionadolistamvc;


public class Vista {

    public void mostrarEstado(double temperatura, double humedad, boolean aireEncendido) {
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Humedad: " + humedad + "%");

        if (aireEncendido) {
            System.out.println("El aire acondicionado esta encendido");
        } else {
            System.out.println("El aire acondicionado esta apagado");
        }
    }
}

