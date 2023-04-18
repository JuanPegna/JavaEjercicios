/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaprendizaje2;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class JavaAprendizaje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read =new Scanner(System.in);
        String nombre;
        System.out.println("Digite su nombre");
        nombre = read.nextLine();
        System.out.println("Su nombre es "+nombre);
    }
    
}
