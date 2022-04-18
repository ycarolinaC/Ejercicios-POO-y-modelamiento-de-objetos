
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Carolina
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        // TODO code application logic here
        
        for (int i=0; i<2; i++){
            Vehiculo v = new Vehiculo();
            v.crearVehiculo();
            vehiculos.add(v);
       }
        
        
       for(int i=0; i<vehiculos.size(); i++){
           System.out.println(vehiculos.get(i).getTypeVehiculo());
       }     
    }
    
}
