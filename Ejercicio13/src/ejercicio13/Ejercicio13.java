/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author juanp
 */
import java.util.Scanner;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String[] Equipo =new String[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite nombre de compañeros");
            Equipo[i]=read.nextLine();
            System.out.println(Equipo[i]);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
