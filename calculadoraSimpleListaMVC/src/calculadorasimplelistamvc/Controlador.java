
package calculadorasimplelistamvc;

import java.util.ArrayList;


public class Controlador {
    private Vista vista;
    
    public Controlador(Vista vista) {
        this.vista = vista;
    }
    
    public void ejecutar() {
        ArrayList<Integer> numeros = vista.obtenerNumeros();
        int opcion = vista.obtenerOperacion();
        
        switch (opcion) {
            case 1:
                modeloSuma calcSuma = new modeloSuma();
                calcSuma.setNumerossuma(numeros); 
                calcSuma.operarSuma();
                break;
            case 2:
                modeloResta calcResta = new modeloResta();
                calcResta.setNumerosresta(numeros); 
                calcResta.operarResta();
                break;
            case 3:
                modeloMultiplicacion calcMulti = new modeloMultiplicacion();
                calcMulti.setNumerosmulti(numeros);
                calcMulti.operarMulti();
                break;
            case 4:
                modeloDivision calcDivi = new modeloDivision();
                calcDivi.setNumerosdivi(numeros);
                calcDivi.operarDivi();
                break;
            default:
                vista.mostrarMensajeError();
                break;
        }
    }
}
