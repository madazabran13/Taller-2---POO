import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in); 
        int nd,gas,cgas,ckm,cost1,est,pea,costot;
         System.out.print("Número de días del viaje: ");
         nd = Entero.nextInt();
         System.out.print("Kilometros conducidos de todo el viaje: ");
         ckm = Entero.nextInt();
         System.out.print("Costo de gasolina por litro: ");
         gas = Entero.nextInt();
         System.out.print("Cantidad de litros: ");
         cgas = Entero.nextInt();
         System.out.print("Pago del estacionamiento: ");
         est = Entero.nextInt();
         System.out.print("Pago de peajes: ");
         pea = Entero.nextInt();
         
         cost1 = (gas*cgas)*ckm;
         costot = (cost1 + est + pea)*nd;
         
         System.out.printf("El costo total del viaje es %d\n: ",costot);
     }
}
