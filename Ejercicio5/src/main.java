/**
 *
 * @author Carolina
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here
        Vehiculo car = new Car(0.5, 4, "Si", 4, "01/01/2022", "Tierra");
        Vehiculo truck = new Truck(2, 8, 3, "Si", 8, "17/04/2022", "Tierra");
        Vehiculo motorcycle = new Motorcycle(2,"Si",2, "10/04/2022", "Tierra"); 
        Vehiculo  bicycle = new Bicycle(1,true, "Si", 2, "25/03/2022", "Tierra");
    }
    
}
