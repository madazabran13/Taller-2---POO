
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        float p,h,bmi;
        System.out.print("Digite el peso(Kg): "); //peso en Kg
        p = Entero.nextFloat();
        System.out.print("Digite la altura(m): "); //altura en m
        h = Entero.nextFloat();
        bmi = p/(h*h);
        
        System.out.printf("El indice de masa corporal es: %.2f kg/m^2 \n", bmi);
    }
}
