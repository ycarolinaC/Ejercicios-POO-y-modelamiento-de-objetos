
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Vehiculo {
    private String color;
    private String typeVehiculo;
    private List<String> vehiculos;
    private int numberPassenger;
    private String crew;
    private int numberWheels;
    private String registrationDate;
    private String displacementMedium;
    private Scanner input;
    
 
    
    public Vehiculo(int numberPassenger, String crew, int numberWheels, String registrationDate, String displacementMedium) {
        input = new Scanner(System.in);
        this.numberPassenger = numberPassenger;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.registrationDate = registrationDate;
        this.displacementMedium = displacementMedium;
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
        System.out.println("Color of vehículo");
        color = solicitarString();
        System.out.println("Número de pasajeros");
        numberPassenger = solicitarInt();
        System.out.println("Is the crew");
        crew = solicitarString();
        System.out.println("Number of wheels");
        numberWheels = solicitarInt();
        System.out.println("Registration date");
        registrationDate = solicitarString();
        System.out.println("Displacement medium");
        displacementMedium = solicitarString();                       
    }

    public String getTypeVehiculo() {
        return typeVehiculo;
    }

    public void setTypeVehiculo(String typeVehiculo) {
        this.typeVehiculo = typeVehiculo;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getDisplacementMedium() {
        return displacementMedium;
    }

    public void setDisplacementMedium(String displacementMedium) {
        this.displacementMedium = displacementMedium;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
