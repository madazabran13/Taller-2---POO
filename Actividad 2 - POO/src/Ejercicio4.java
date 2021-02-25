
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        float r,l,A, pi=3.1416f;
        System.out.print("Digite el valor del radio:  ");
        r = Entero.nextFloat();
       
        l = 2*pi*r;
        A = pi*r*r;
        
        System.out.printf("La longitud es: %.2f\n", l);
        System.out.printf("El area de la circunferencia es: %.2f\n", A);
    
    }
}
