/**
 *
 * @author Carolina
 */
public class Car extends Vehiculo{
    private double loadingCapacity;
    private int changesCar;
    public Car(double loadingCapacity,int numberPassenger, String crew, int numberWheels, String registrationDate, String displacementMedium) {
        super( numberPassenger, crew,  numberWheels,  registrationDate, displacementMedium);
        this.loadingCapacity = loadingCapacity;
        this.changesCar = 6;
    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
    
    
    
}
