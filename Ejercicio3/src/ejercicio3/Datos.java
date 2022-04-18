
package ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Datos {
    private int l;
    private boolean bandera = true;
    private List<Integer> numeros = new ArrayList<>();
    private Scanner input;
    private int opcion;
    
    
    public Datos(int l) throws IOException{
        this.l = l;
        numeros();
        input = new Scanner(System.in);
        
        do{
           menu();
           bandera=evaluar(opcion); 
        }while(bandera==true);
    }
    
        
    private void numeros(){
        Random r = new Random();
        for(int i=0;i<l;i++){
            numeros.add(r.nextInt(100));
        }
        
        System.out.println(numeros);
    }
    
    private void ordenarAsc(){
        int n = numeros.size();
        //System.out.println(n);
        for (int i=0; i<n; i++){
            
            for(int j=0; j<n-1; j++){
                //System.out.println(numeros.get(i)); 
                //System.out.println(numeros.get(j)); 
                if(numeros.get(j) >numeros.get(j+1)){
                    //System.out.println("es mayor"); 
                    int aux =numeros.get(j);
                    numeros.set(j, numeros.get(j+1)); 
                    numeros.set(j+1,aux);                 
                }
            }       
        }
        
        System.out.println(numeros);
    }
    
     private void ordenarDes(){
        int n = numeros.size();
        //System.out.println(n);
        for (int i=0; i<n; i++){
            
            for(int j=0; j<n-1; j++){
                //System.out.println(numeros.get(i)); 
                //System.out.println(numeros.get(j)); 
                if(numeros.get(j) <numeros.get(j+1)){
                    //System.out.println("es mayor"); 
                    int aux =numeros.get(j);
                    numeros.set(j, numeros.get(j+1)); 
                    numeros.set(j+1,aux);                 
                }
            }       
        }
        
        System.out.println(numeros);
    }
    
     private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
     
     private void menu(){
        System.out.println("Menú ordenar");
        System.out.println("Elige una opción");
        System.out.println("1.Orden ascendente");
        System.out.println("2.Orden descendente");
        System.out.println("3.Salir");
        opcion= solicitarInt();
     }
     
      private boolean evaluar(int opcion) throws IOException{
        switch(opcion){
            case 1:
                ordenarAsc();
                return true;
            case 2:
                ordenarDes();
            case 3:
                
                return false;
            default:
                 System.out.println("Opción inválida");
                 System.in.read();

        }
        return true;
    }
     
}