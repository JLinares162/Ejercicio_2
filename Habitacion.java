public class Habitacion {
    
    private int numero; 
    private String tipoHabitacion;
    private int capacidad;
    private double precioPorNoche;


    public Habitacion(int numero, String tipoHabitacion, int capacidad, double precioPorNoche) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.capacidad = capacidad;
        this.precioPorNoche = precioPorNoche;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getTipoHabitacion() {
        return tipoHabitacion;
    }


    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    public int getCapacidad() {
        return capacidad;
    }


    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public double getPrecioPorNoche() {
        return precioPorNoche;
    }


    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }


    @Override
    public String toString() {
        return "Habitacion [numero=" + numero + ", tipoHabitacion=" + tipoHabitacion + ", capacidad=" + capacidad
                + ", precioPorNoche=" + precioPorNoche + "]";
    }
}
