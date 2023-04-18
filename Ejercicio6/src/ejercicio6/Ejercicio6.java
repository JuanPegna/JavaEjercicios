/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner read= new Scanner(System.in);
        System.out.println("Por favor digite un número");
        int num1 = read.nextInt();
           System.out.println("Por favor digite otro número");
        int num2 = read.nextInt();
        if (num2 >25 && num1 >25)
        {
             System.out.println("Los dos números son mayores a 25");
        } else if(num1>25 && num2<25)
        {
            System.out.println("El número 1 es mayor a 25");
        } else if (num2 >25 && num1<25)
        {
            System.out.println("El número 2 es mayor a 25");
        }else
        {
            System.out.println("Ambos números son menores a 25");
        }
            
    }
           
        
    }
    
