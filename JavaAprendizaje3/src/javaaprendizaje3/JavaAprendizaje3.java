/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaprendizaje3;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class JavaAprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner read =new Scanner(System.in);
       String frase, aux;
       System.out.println("Digite una frase");
       frase = read.nextLine();
        System.out.println(frase);
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
