/*MB17003
Diseñe un algoritmo que imprima en orden descendente 3 números leídos.
 */
package descendientes_orden;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author DRAKI_MB
 */
public class Descendientes_Orden {
    public static void main(String[] args) {
        int num1,num2,num3;
        String cartor;
        //Numero 1
        cartor = JOptionPane.showInputDialog("Escriba el primer número..." );
        num1 = Integer.parseInt( cartor);
        //Numero 2
        cartor = JOptionPane.showInputDialog("Escriba el primer número..." );
        num2 = Integer.parseInt( cartor);
        //Numero 3
        cartor = JOptionPane.showInputDialog("Escriba el primer número..." );
        num3 = Integer.parseInt( cartor);

        int [] a  = {num1,num2,num3};
        int menor;
        
        System.out.println("Orden descendiente de los numeros ingresados");

      int temporal = 0;

    for (int i = 0; i < a.length; i++) {
        for (int j = 1; j < (a.length - i); j++) {
            if (a[j - 1] > a[j]) {
                temporal = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temporal;
            }
        }
    }
    System.out.println(Arrays.toString(a));
}
}