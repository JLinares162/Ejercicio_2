public class Cliente {

    private String nombre;
    private int numeroVisitas;
 
    public Cliente(){

    }

    public Cliente(String nombre, int numeroVisitas) {
        this.nombre = nombre;
        this.numeroVisitas = numeroVisitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", numeroVisitas=" + numeroVisitas + "]";
    }
}
