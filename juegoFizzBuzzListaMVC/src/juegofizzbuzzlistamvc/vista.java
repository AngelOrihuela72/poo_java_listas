
package juegofizzbuzzlistamvc;

import java.util.Scanner;

public class vista {
    // metodo mostrar mensaje
    public int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        return entrada.nextInt();
    }

    // metodo mostrar resultado
    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }

    // metodo mostrar la lista
    public void mostrarListaNumeros(String listaNumeros) {
        System.out.println("Lista de numeros ingresados: " + listaNumeros);
    }
}
