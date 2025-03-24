
package deteccionintrusoslistamvc;
import java.util.Random;

public class ControladorMain {

        private Vista vista;
        private Random random;

    public ControladorMain() {
        vista = new Vista();
        random = new Random();
    }

    public void iniciar() {
        boolean noche = false;

        while (true) {
            // Mostrar el menú y obtener la opción seleccionada
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    // Preguntar si es de noche
                    noche = vista.preguntarEsDeNoche();

                    // Crear los sensores con valores aleatorios
                    boolean[] sensores = new boolean[3];
                    sensores[0] = random.nextBoolean(); // Sensor 1
                    sensores[1] = random.nextBoolean(); // Sensor 2
                    sensores[2] = random.nextBoolean(); // Sensor 3

                    // Mostrar la lectura de los sensores
                    vista.mostrarLecturaSensores(sensores);

                    // Activar la alarma y mostrar el resultado
                    boolean alarmaActivada = Modelo.activarAlarma(sensores, noche);
                    vista.mostrarResultadoActivacion(alarmaActivada);
                    break;

                case 2:
                    // Desactivar la alarma
                    vista.mostrarAlarmaDesactivada();
                    break;

                case 3:
                    // Salir del programa
                    vista.mostrarSaliendo();
                    vista.cerrar();
                    return;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ControladorMain controlador = new ControladorMain();
        controlador.iniciar();
    }
    }
    
