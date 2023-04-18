/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite la nota a ingresar correctamente entre 0 y 10");
        nota =read.nextInt();
        while (nota <=0 || nota >=10){
            System.out.println("Por favor digite la nota correcta entre 0 y 10 inclusive");
            nota =read.nextInt();
        }
        System.out.println("Muchas Gracias");
    }
    
}
