
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char cara = Entero.next().charAt(0);
        
        System.out.printf("El valor entero es: %d\n", (int)cara);
    }
    
}
