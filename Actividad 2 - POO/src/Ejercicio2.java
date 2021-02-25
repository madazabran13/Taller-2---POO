
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        int num1, num2, suma, dif, prod;
        System.out.print("Digite un primer numero entero: ");
        num1 = Entero.nextInt();
  
        System.out.print("Digite un segundo numero entero: ");
        num2 = Entero.nextInt();
        
        suma = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        
        System.out.printf("La suma de los numeros es: %d\n", suma);
        System.out.printf("La diferencia de los numeros es: %d\n", dif);
        System.out.printf("El producto de los numeros es: %d\n", prod);
    }
}
