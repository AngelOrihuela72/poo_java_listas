
package deteccionintrusoslistamvc;

import java.util.Scanner;

public class Vista {
    private Scanner entrada;

    public Vista() {
        entrada = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("1. Activar alarma");
        System.out.println("2. Desactivar alarma");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        return entrada.nextInt();
    }


    public boolean preguntarEsDeNoche() {
        System.out.println("¿Es de noche? (si/no)");
        String respuesta = entrada.next().trim().toLowerCase();
        return respuesta.equals("si");
    }


    public void mostrarLecturaSensores(boolean[] sensores) {
        System.out.println("Lectura de sensores:");
        System.out.println("Sensor 1: " + sensores[0]);
        System.out.println("Sensor 2: " + sensores[1]);
        System.out.println("Sensor 3: " + sensores[2]);
    }


    public void mostrarResultadoActivacion(boolean alarmaActivada) {
        if (alarmaActivada) {
            System.out.println("Alarma activada");
        } else {
            System.out.println("Alarma no activada");
        }
    }


    public void mostrarAlarmaDesactivada() {
        System.out.println("Alarma desactivada");
    }


    public void mostrarSaliendo() {
        System.out.println("Saliendo del programa...");
    }


    public void cerrar() {
        entrada.close();
    }
}
