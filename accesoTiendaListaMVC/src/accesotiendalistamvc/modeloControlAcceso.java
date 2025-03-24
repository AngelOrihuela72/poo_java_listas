
package accesotiendalistamvc;


public class modeloControlAcceso {
    private modeloHora hora;

    public modeloControlAcceso() {
        this.hora = new modeloHora();
    }

    public boolean verificarAcceso(modeloCliente cliente) {
        if (cliente.esEmpleado() || (cliente.tieneMembresia() && hora.estaDentroHorarioAtencion())) {
            return true;
        }
        return false;
    }

    public void mostrarAcceso(modeloCliente cliente) {
        if (verificarAcceso(cliente)) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
