
package calculadorasimplelistamvc;

import java.util.ArrayList;

public class modeloMultiplicacion {
    private ArrayList<Integer> numeros;
    
    public void setNumerosmulti(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }
    
    public void operarMulti(){
        if (numeros.size() >= 2) {
            int multi = numeros.get(0) * numeros.get(1);
            System.out.println("La multiplicacion es: " + multi);
        } else {
            System.out.println("No se han ingresado suficientes numeros.");
        }
    }
}
