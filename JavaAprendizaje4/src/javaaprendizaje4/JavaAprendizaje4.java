/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaprendizaje4;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class JavaAprendizaje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read =new Scanner(System.in);
        float C,F;
        System.out.println("Digite los grados Celsius para convertir");
        C = read.nextFloat();
        F=32+(9*(C/5));
        System.out.println("la conversión de grados "+C+"C°, es en "+F+" F°");
        
    }
    
}
