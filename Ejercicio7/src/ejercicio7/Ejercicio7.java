/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner read = new Scanner(System.in);
        int motor;
        System.out.println("Digite el tipo de motor que desea usar");
        motor = read.nextInt();
        switch (motor){
            case 1:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 2:
                System.out.println("La bomba es una bomba de agua");
                break; 
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
    
}
