package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Carolina
 */
public class Vectornumeros {
   
    Vector <Integer> vectorNumbers = new Vector <> ();
    private Scanner input;
    private int number;
    private boolean flag = true;
    public Vectornumeros() {
        input = new Scanner(System.in);
        
        do{ System.out.println("Ingresa un número");
            number = solictInt();
            if(vectorNumbers.size()==0){
              vectorNumbers.add(number);  
            }else{
              if(vectorNumbers.get(vectorNumbers.size()-1)==number){
                  flag = false;
              }else{
                  vectorNumbers.add(number);  
              }
            }
        }while(flag==true);  
        
        System.out.println("Los números ingresados son : "+vectorNumbers);
    }
     
    private int solictInt(){
       return Integer.parseInt(input.nextLine()); 
    }
    
}
