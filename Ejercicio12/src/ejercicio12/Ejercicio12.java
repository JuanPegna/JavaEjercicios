/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite el número 1");
        num1=read.nextInt();
        System.out.println("Digite el número 2");
        num2=read.nextInt();
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2){
        int aux1;
        aux1=num2%num1;
        if(aux1==0){
            System.out.println("Son Multiplos");
        }
            else{
            System.out.println("No son multiplos");
        }
    }
}
