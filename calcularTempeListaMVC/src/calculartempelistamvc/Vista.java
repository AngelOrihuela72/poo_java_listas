
package calculartempelistamvc;


public class Vista {
    public void mostrarTemperatura(double temperatura) {
        System.out.println("Temperatura en el invernadero: " + temperatura + "°C");
    }

    public void mostrarEstadoCalefactor(boolean encendido) {
        if (encendido) {
            System.out.println("El calefactor está encendido");
        } else {
            System.out.println("El calefactor está apagado");
        }
    }

    public void mostrarEstadoVentilador(boolean encendido) {
        if (encendido) {
            System.out.println("El ventilador está encendido");
        } else {
            System.out.println("El ventilador está apagado");
        }
    }
}
