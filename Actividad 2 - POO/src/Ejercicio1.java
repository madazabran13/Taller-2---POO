/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel Andrés
 */

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite un primer numero entero: ");
        num1 = Entero.nextInt();
  
        System.out.print("Digite un segundo numero entero: ");
        num2 = Entero.nextInt();
        
        System.out.printf("num1 = %d\n", num1 );
        System.out.printf("El valor de %d + %d es %d\n",num1, num1,(num1 + num1));
        System.out.printf("num1 = %.2f\n",(double)num1);
        System.out.printf("%d - %d\n", (num1 + num2),(num2 + num1));
    }  
}
