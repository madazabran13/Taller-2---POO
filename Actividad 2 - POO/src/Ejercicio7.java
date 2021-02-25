
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in); 
        int pc,pv,uti;
        float util;
        System.out.print("Digite el precio de compra: "); 
        pc = Entero.nextInt();
        System.out.print("Digite el precio de venta: "); 
        pv = Entero.nextInt();
        
        uti = pv - pc;
        util = (float)uti/pv*100;
        
        System.out.printf("El porcentaje de utilidad es: %.2f\n", util);
    }
}

