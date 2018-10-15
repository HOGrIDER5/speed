/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mouner4;
import java.util.Scanner;

/**
 *
 * @author amsta5248
 */
public class Mouner4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Keyboard = new Scanner (System.in);
        
       double distance ;
       double time ;
       double Speed;
       
        System.out.println("Please enter your distance");
        distance= Keyboard.nextDouble();
        
        System.out.println("Please enter you time");
        time= Keyboard.nextDouble();
        
        Speed = distance/ time ;
        
        System.out.println("Your spped is " + Speed +"m/s" );
        
        
        
        
                
      
        
        // TODO code application logic here
    }
    
}
