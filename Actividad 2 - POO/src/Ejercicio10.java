
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in); 
        float p,g,l,t;
        System.out.print("Digite el peso del objeto(Kg): ");
        p = Entero.nextFloat();
        
        g = (float)p*1000;
        l = (float)p*2.205f;
        t = (float)p/1000;
        
        System.out.printf("La equivalencia en gramos es: %.2f\n",g);
        System.out.printf("La equivalencia en libras es: %.2f\n",l);
        System.out.printf("La equivalencia en toneladas es: %.2f\n",t);
    }
    
}
