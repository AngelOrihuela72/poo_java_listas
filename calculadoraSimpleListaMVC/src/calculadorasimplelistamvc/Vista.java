package calculadorasimplelistamvc;

import java.util.Scanner;
import java.util.ArrayList;

public class Vista {
    private Scanner entrada;
    
    public Vista() {
        entrada = new Scanner(System.in);
    }
    
    public ArrayList<Integer> obtenerNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingrese el primer numero: ");
        numeros.add(entrada.nextInt());
        
        System.out.println("Ingrese el segundo numero: ");
        numeros.add(entrada.nextInt());
        
        return numeros;
    }
    
    public int obtenerOperacion() {
        System.out.println("Ingrese la opcion de la operacion a realizar: ");
        System.out.println("1. SUMA\n2. RESTA\n3. MULTIPLICACION\n4. DIVISION");
        return entrada.nextInt();
    }
    
    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }
    
    public void mostrarMensajeError() {
        System.out.println("Opcion no valida");
    }
}
