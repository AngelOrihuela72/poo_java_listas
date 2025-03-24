
package juegofizzbuzzlistamvc;

import java.util.ArrayList;


public class controlador {
    private modelo modelo;
    private vista vista;
    private ArrayList<Integer> listaNumeros;

    // constructor
    public controlador() {
        this.modelo = new modelo();
        this.vista = new vista();
        this.listaNumeros = new ArrayList<>();
    }

    // metodo iniciar juego
    public void iniciarJuego() {
        int num = vista.pedirNumero(); // pide a la vista un numero
        listaNumeros.add(num); // guarda

        String resultado = modelo.calcularFizzBuzz(num); //calcula el resultado
        vista.mostrarResultado(resultado); //muestra en la vista
        vista.mostrarListaNumeros(listaNumeros.toString()); // muestra la lista de resultados
    }
}
