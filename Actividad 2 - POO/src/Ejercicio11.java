
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in); 
        int n,uni,dec,cen;
        System.out.print("Digite un numero entre (0-1000): ");
        n = Entero.nextInt();
        int numero;
        
        uni = n%10;
        n = n/10;
        dec = n%10;
        n = n/10;
        cen = n%10;
        
        System.out.printf("Las cifras correspondientes son:\n");
        System.out.printf("Unidad: %d\n",uni);
        System.out.printf("Decena: %d\n",dec);
        System.out.printf("Centena: %d\n",cen);
       
     
         
     }
}
