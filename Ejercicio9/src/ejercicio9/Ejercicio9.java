/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num1;
        int suma=0;
        int cont=0;
        do{
            System.out.println("Digite una nota");
            num1=read.nextInt();
            if(num1>0){
                suma=num1+suma;
                cont++;
            }
        }while(num1!=0 && cont<=19);
        if (num1==0){
            System.out.println("Se capturó el número 0");
        }
        System.out.println("La suma de los números ingresados es");
        System.out.println(suma);
    }
     
}
    

