public class Reserva {
    
    private Habitacion habitacion;
    private Cliente cliente; 
    
    public Reserva(Habitacion habitacion, Cliente cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva [habitacion=" + habitacion + ", cliente=" + cliente + "]";
    } 
}
