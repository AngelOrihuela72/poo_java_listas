
package calculadorasimplelistamvc;

import java.util.ArrayList;

public class modeloDivision {
    
    private ArrayList<Integer> numeros;
    
    public void setNumerosdivi(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    
    public void operarDivi(){
        if (numeros.size() >= 2) {
            int divi = numeros.get(0) / numeros.get(1);
            System.out.println("La division es: " + divi);
        } else {
            System.out.println("No se han ingresado suficientes numeros.");
        }
    }
}