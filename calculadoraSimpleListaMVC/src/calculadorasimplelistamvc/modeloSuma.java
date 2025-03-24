package calculadorasimplelistamvc;

import java.util.ArrayList;


public class modeloSuma {
    
    private ArrayList<Integer> numeros;
    

    public void setNumerossuma(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }
    

    public void operarSuma(){
        if (numeros.size() >= 2) {
        
            int suma = numeros.get(0) + numeros.get(1);
            System.out.println("La suma es: " + suma);
        } else {
            System.out.println("No se han ingresado suficientes numeros.");
        }
    }
}

