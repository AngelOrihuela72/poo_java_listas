package accesotiendalistamvc;

import java.util.ArrayList; 

public class Main {

    public static void main(String[] args) {
        modeloControlAcceso sistema = new modeloControlAcceso();
        vista vista = new vista(); 

        // creo el array
        ArrayList<modeloCliente> clientes = new ArrayList<>();  
        
        // se añaden clientes al array
        clientes.add(new modeloCliente(true, false));  // Cliente 1
        clientes.add(new modeloCliente(false, false)); // Cliente 2
        clientes.add(new modeloCliente(false, true));  // Cliente 3

        // reemplazo
        while (true) {
            for (int i = 0; i < clientes.size(); i++) {  
                modeloCliente cliente = clientes.get(i);  // los obtengo los clientes
                vista.mostrarMensaje("Cliente " + (i + 1) + ":");
                sistema.mostrarAcceso(cliente);
            }

            try {
                Thread.sleep(5000);  // 5 seg de espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
