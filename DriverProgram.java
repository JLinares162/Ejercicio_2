import java.util.Scanner;

public class DriverProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Iniciando sistema....");
        System.out.println("---Ingreso de las 3 primeras habitaciones---");
        for(int x = 0; x < 1; x++){
            System.out.println("---------------Creando habitacion nueva---------------");
            
            System.out.println("Tipo de Habitacion:");
            System.out.println("1. VIP\n2. Deluxe\n3. Estándar");
            int top = 0;
            System.out.print("Ingrese el tipo:");
            top = scanner.nextInt();
            String tipoHabitacion = "";
            if(top == 1){
                tipoHabitacion = "VIP";
            }if(top == 2){
                tipoHabitacion = "Deluxe";
            }if(top == 3){
                tipoHabitacion = "Estándar";
            }


            System.out.print("Capacidad:");
            int capacidad = scanner.nextInt();
            

            System.out.print("Precio por noche:");
            double precioPorNoche = scanner.nextDouble(); 
            scanner.nextLine();

            hotel.crearHabitacion(tipoHabitacion, capacidad, precioPorNoche);
        }
        System.out.println("------------Habitaciones creadeas exitosamente-------------");
        System.out.println(hotel.imprimirHabitaciones());
        System.out.println("-----------------------------------------------------------");
        

        String opciones = "----------------------------Menú-----------------------------\n1.Recibir huésped (Ingresar Cliente)\n2.Reservar (Asignar Habitacion a Cliente)\n3.Crear Habitacion nueva\n4.Historial de Reservas\n5.Salir";
        int op = 0;
        
        do{

            System.out.println(opciones);
            System.out.print("Ingrese el opcion:");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nombre del Cliente: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Numero de visitas al hotel: ");
                    int numeroVisitas = scanner.nextInt();
                    scanner.nextLine();

                    hotel.LlenarCliente(nombre, numeroVisitas);
                break;
                
                case 2:
                    System.out.println("Numero de Habitacion:");
                    int numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nombre del Cliente:");
                    String nombreCliente = scanner.nextLine();
                    
                    hotel.Reservacion(numeroHabitacion, nombreCliente);
                break;

                case 3:
                    System.out.println("---------------Creando habitacion nueva---------------");
                    System.out.println("Tipo de Habitacion:");
                    System.out.println("1. VIP\n2. Deluxe\n3. Estándar");
                    int top = 0;
                    System.out.print("Ingrese el tipo:");
                    top = scanner.nextInt();
                    String tipoHabitacion = "";
                    if(top == 1){
                        tipoHabitacion = "VIP";
                    }if(top == 2){
                        tipoHabitacion = "Deluxe";
                    }if(top == 3){
                        tipoHabitacion = "Estándar";
                    }
                
                    System.out.print("Capacidad:");
                    int capacidad = scanner.nextInt();
                    
                    System.out.print("Precio por noche:");
                    double precioPorNoche = scanner.nextDouble(); 
                    scanner.nextLine();

                    hotel.crearHabitacion(tipoHabitacion, capacidad, precioPorNoche);
                    System.out.println(hotel.imprimirHabitaciones());
                break;

                case 4:
                    System.out.println(hotel.imprimirReservaciones());
                break;

            default:
                break;
            }
        }while(op>=0 && op<4);
    }
}

    