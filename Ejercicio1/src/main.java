
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
        
        Planetarysistem s = new Planetarysistem("Solar System");
        
        Planet planet1 = new Planet(1,"Mercury",3.285*Math.pow(10,23), 5.543 , 2*2439.7, 57.91*Math.pow(10,6) );
        Planet planet2 = new Planet(2,"Venus",4.8673*Math.pow(10,24), 5.243 , 12104, 261*Math.pow(10,6) );
        Planet planet3 = new Planet(3,"Earth",5.9736*Math.pow(10,24), 5.515 , 2*6378.1, 149.7*Math.pow(10,6) );
        Planet planet4 = new Planet(4,"Mars",6.4169*Math.pow(10,23), 3.934 , 6792, 229*Math.pow(10,6) );
        Planet planet5 = new Planet(5,"Jupiter",1.90*Math.pow(10,27), 3.01 , 69.911, 778.5*Math.pow(10,6) );
        Planet planet6 = new Planet(6,"Saturn",5.6832*Math.pow(10,26), 0.687 , 120.660, 1418*Math.pow(10,6) );
        Planet planet7 = new Planet(7,"Uranus",8.681*Math.pow(10,25), 1.271 , 2*25.362, 2871*Math.pow(10,9) );
        Planet planet8 = new Planet(8,"Neptune",1.024*Math.pow(10,26), 1.64 , 2*24622, 4495*Math.pow(10,9) );
        
        s.addPlanet(planet1);
        s.addPlanet(planet2);
        s.addPlanet(planet3);
        s.addPlanet(planet4);
        s.addPlanet(planet5);
        s.addPlanet(planet6);
        s.addPlanet(planet7);
        s.addPlanet(planet8);
        
        s.listPlanet();
        
        s.gravitational();
    }
    
}
