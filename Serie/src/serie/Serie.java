/*MB17003
Escriba un algoritmo que obtenga la suma e imprima además los términos de la siguiente
serie:
2, 5, 7, 10, 12, 15, 17, ..., 1800
 */
package serie;
import java.util.Arrays;

/**
 *
 * @author DRAKI_MB
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acumulador=0;
        int resultado=0;
        int q=2;
        int w=3;
        int sum1;
        int sum2;
        do{
            acumulador=acumulador+q;
            sum1=resultado+acumulador;
            System.out.print(","+acumulador);
            acumulador=acumulador+w;
            sum2=sum1+acumulador;
            System.out.print(","+acumulador);
            resultado=sum2;
            
        }while(acumulador<1800);
        
        System.out.println("");
        System.out.println("Suma de serie: ");
        System.out.println(resultado);
    }
    
}