
import java.util.Objects;
/**
 *
 * @author Carolina
 */
public class Planet {
    private int id;
    private String name;
    private final double mass;
    private final double density;
    private double diameter;
    private double distanceSun;

    public Planet(int id , String name, double mass, double density, double diameter, double distanceSun) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.mass = Objects.requireNonNull(mass);
        this.density = Objects.requireNonNull(density);
        this.diameter = Objects.requireNonNull(diameter);
        this.distanceSun = Objects.requireNonNull(distanceSun);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public int getId() {
        return id;
    }    
        
}
