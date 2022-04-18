
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


/**
 *
 * @author Carolina
 */
public class Planetarysistem {
    final double  G = 6.67*Math.pow(10,-11);
    private ArrayList<Planet> planets;
    private double force;
    private String name;
    private Scanner input;
    private double mass1;
    private double mass2;
    private double r ;
    
    public Planetarysistem(String name){
        input = new Scanner(System.in);
        this.planets = new ArrayList<>();
        this.name = name;
    }
    
    public void addPlanet(Planet planet){
        planets.add(planet);
    }
    
    public ArrayList<Planet> planets(){
        return planets;
    }
    
    public void listPlanet() {
        System.out.println("Planets of " + name);
        for (Planet planet : planets) {
            System.out.println(planet.getId()+ "." +planet.getName());
        }
    }
    
    private String solicitString(){   
        return input.nextLine();
    }
    
    public void gravitational(){
        
        if (planets.size()>2){
            System.out.println("To calculate the gravitational force, choose two planets according to the list ");
            listPlanet();
            System.out.println("First planet ");
            int id1 = Integer.parseInt(solicitString());
            System.out.println("Second planet ");
            int id2 = Integer.parseInt(solicitString());
            double mass1 = planets.get(id1-1).getMass();
            double mass2 = planets.get(id2-1).getMass();
            double r = planets.get(id1-1).getDistanceSun() - planets.get(id2-1).getDistanceSun();
            force = G *( mass1*mass2)/Math.pow(r, 2);
            System.out.println("the gravitational force between "+planets.get(id1-1).getName() + " and "+planets.get(id2-1).getName() +" is "+ force +"N");

        }else{
            System.out.println("There are not enough planets ");
        }    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
