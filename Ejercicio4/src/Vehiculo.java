
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Carolina
 */
public class Vehiculo {
    private String typeVehiculo;
    private List<String> vehiculos;
    private int numberPassenger;
    private String crew;
    private int numberWheels;
    private String registrationDate;
    private String displacementedium;
    private Scanner input;
    
    public Vehiculo(){
        input = new Scanner(System.in);
    }
    
    private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
    private String solicitarString(){   
        return input.nextLine();
    }

    public void crearVehiculo(){
        System.out.println("Type of vehículo");
        typeVehiculo = solicitarString();
        System.out.println("Number passengers");
        numberPassenger = solicitarInt();
        System.out.println("Is the crew");
        crew = solicitarString();
        System.out.println("Number of wheels");
        numberWheels = solicitarInt();
        System.out.println("Registration date year");
        registrationDate = solicitarString();
        System.out.println("Displacement medium");
        displacementedium = solicitarString();  
                     
    }

    public String getTypeVehiculo() {
        return typeVehiculo;
    }
       
    
}
