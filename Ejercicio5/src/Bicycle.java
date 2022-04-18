/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina
 */
public class Bicycle extends Vehiculo{
    private String driveSytem;
    private boolean palancChange;

    public Bicycle(int numberPassenger, boolean palancChange, String crew, int numberWheels, String registrationDate, String displacementMedium) {
        super( numberPassenger, crew,  numberWheels,  registrationDate, displacementMedium);
        this.driveSytem = "Viela";
        this.palancChange = palancChange;
    }

    public String getDriveSytem() {
        return driveSytem;
    }
    
    
}
