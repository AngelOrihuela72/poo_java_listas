
package calculadorasimplelistamvc;

import java.util.ArrayList;

public class modeloResta {
     private ArrayList<Integer> numeros;
    
    public void setNumerosresta(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }
    
    public void operarResta(){
        if (numeros.size() >= 2) {
            int resta = numeros.get(0) - numeros.get(1);
            System.out.println("La resta es: " + resta);
        } else {
            System.out.println("No se han ingresado suficientes numeros.");
        }
    }
}
