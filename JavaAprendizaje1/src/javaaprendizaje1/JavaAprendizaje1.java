/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaprendizaje1;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class JavaAprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite número 1");
        num1= read.nextInt();
        System.out.println("Digite número 2");
        num2 =read.nextInt();
        num2=num1+num2;
        System.out.println("La suma de los dos números es " +num2);
    }
    
}
