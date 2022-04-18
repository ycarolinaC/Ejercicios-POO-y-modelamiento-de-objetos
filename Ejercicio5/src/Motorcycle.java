/**
 *
 * @author Carolina
 */
public class Motorcycle extends Vehiculo{
    private int numberLights;
    private String protection;
    public Motorcycle(int numberPassenger, String crew, int numberWheels, String registrationDate, String displacementMedium) {
        super( numberPassenger, crew,  numberWheels,  registrationDate, displacementMedium);
        this.numberLights = 1;
        this.protection = "Casco";
    }

    public int getNumberLights() {
        return numberLights;
    }

    public String getProtection() {
        return protection;
    }
      
    
}
