
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
    Scanner Entero = new Scanner(System.in);
        float num1, num2, num3, suma, prom, prod, coc, modulo;
        System.out.println("Digite un  numero decimal: ");
        num1 = Entero.nextFloat();
  
        System.out.println("Digite otro numero decimal: ");
        num2 = Entero.nextFloat();
        
        System.out.println("Digite un ultimo numero decimal: ");
        num3 = Entero.nextFloat();
        
        suma = num1 + num2 + num3;
        prom = suma/3;
        prod = num1*num2*num3;
        coc = num1/num2/num3;
        modulo = num1%num2%num3;
        
        System.out.printf("La suma es: %.2f\n", suma);
        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("El producto es: %.2f\n", prod);
        System.out.printf("El cociente es: %.2f\n", coc);
        System.out.printf("El modulo es: %.2f\n", modulo);
        
        
    }
   
}
