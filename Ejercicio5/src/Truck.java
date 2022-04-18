/**
 *
 * @author Carolina
 */
public class Truck extends Vehiculo{
    
    private double height;
    private int changesCar;
    public Truck(double height, int changesCar, int numberPassenger, String crew, int numberWheels, String registrationDate, String displacementMedium) {
        super( numberPassenger, crew,  numberWheels,  registrationDate, displacementMedium);
        this.height =  height;
        this.changesCar = changesCar;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
}
