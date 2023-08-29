import java.util.Arrays;

public class Hotel { 
    
    private Habitacion[] habitaciones;
    private Cliente[] clientes;
    private Reserva[] reservas;
    
    public Hotel(){
        habitaciones = new Habitacion[5];
        clientes = new Cliente[5];
        reservas = new Reserva[5];
    }

    @Override
    public String toString() {
        return "Hotel [habitaciones=" + Arrays.toString(habitaciones) + ", clientes=" + Arrays.toString(clientes)
                + ", reservas=" + Arrays.toString(reservas) + "]";
    }

    public String imprimirHabitaciones() {
        return Arrays.toString(habitaciones);
    }

    public String imprimirClientes() {
        return Arrays.toString(clientes);
    }

    public String imprimirReservaciones() {
        return Arrays.toString(reservas);
    }

    int numero = 0;
    public void crearHabitacion(String tipoHabitacion, int capacidad, double precioPorNoche){
        Habitacion habitacion = new Habitacion(numero, tipoHabitacion, capacidad, precioPorNoche);
        habitaciones[numero]= habitacion;
        numero++;
    }

    public void LlenarCliente(String nombre, int numeroVisitas){
        int i = 0;
        if (i < clientes.length){
            Cliente cliente = new Cliente(nombre, numeroVisitas);
            clientes[i]= cliente;
            System.out.println(clientes[i]);
            i++;
        }
    }

    public Habitacion obtenerHabitacionPorNumero(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion != null && habitacion.getNumero() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null; // No se encontró ninguna habitación con el número dado
    }

    public Cliente obtenerClientePorNombre(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente;
            }
        }
        return null; // No se encontró ningún cliente con el nombre dado
    }

    /*
    public void Reservacion(int numeroHabitacion, String nombreCliente){
        int i = 0;
        if (i < clientes.length){    
            Habitacion habitacion = obtenerHabitacionPorNumero(numeroHabitacion);
            Cliente cliente = obtenerClientePorNombre(nombreCliente);
            Reserva reserva = new Reserva(habitacion, cliente);
            reservas[i]=reserva;
            System.out.println(reservas[i]);
            i++;
        }
    }
     */

    public void Reservacion(int numeroHabitacion, String nombreCliente) {
        Habitacion habitacion = obtenerHabitacionPorNumero(numeroHabitacion);
        Cliente cliente = obtenerClientePorNombre(nombreCliente);
    
        if (habitacion != null && cliente != null) {
            if (habitacion.getTipoHabitacion() == "Estándar") {
                crearReserva(habitacion, cliente);
            } else if (habitacion.getTipoHabitacion() == "Deluxe") {
                if (cliente.getNumeroVisitas() >= 5) {
                    crearReserva(habitacion, cliente);
                } else {
                    System.out.println("El cliente no cumple con las condiciones para reservar una habitación Deluxe.");
                }
            } else if (habitacion.getTipoHabitacion() == "VIP") {
                if (cliente.getNumeroVisitas() >= 10) {
                    crearReserva(habitacion, cliente);
                } else {
                    System.out.println("El cliente no cumple con las condiciones para reservar una Suite.");
                }
            }
        } else {
            System.out.println("Habitación o cliente inválido.");
        }
    }
    
    private void crearReserva(Habitacion habitacion, Cliente cliente) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                Reserva reserva = new Reserva(habitacion, cliente);
                reservas[i] = reserva;
                System.out.println("Reserva realizada con éxito.");
                return;
            }
        }
        System.out.println("No hay espacio disponible para realizar la reserva.");
    }
    
}
