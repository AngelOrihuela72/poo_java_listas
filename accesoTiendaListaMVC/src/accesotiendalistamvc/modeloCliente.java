
package accesotiendalistamvc;



public class modeloCliente {
    private boolean tieneMembresia;
    private boolean esEmpleado;

    public modeloCliente(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }
}


