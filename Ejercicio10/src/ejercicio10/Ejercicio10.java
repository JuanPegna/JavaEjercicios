/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite un número");
            num=read.nextInt();
            while(num <=0 || num >=21){
                System.out.println("Digite el número correctamente");
                num=read.nextInt();               
            }
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}