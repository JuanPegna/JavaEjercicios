/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor digite su inicial del primer nombre");
        char letra = leer.next().charAt(0);
        System.out.println(letra);
        System.out.println("Digite un número");
        double numero = leer.nextDouble();
        System.out.println(numero);
        System.out.println("Digite un digito");
        boolean digito = leer.nextBoolean();
        System.out.println(digito);
                
    }
    
}
