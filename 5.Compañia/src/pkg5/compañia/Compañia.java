/*MB17003
Una compañía dedicada al alquiler de automóviles cobra $30.00 hasta un máximo de 300 Km
de distancia recorrida. Para más de 300 y hasta 1000 Km cobra $30.00 más un monto
adicional de $0.15 por cada Kilómetro en exceso sobre 300. Para más de 1000 Km cobra $30
más un monto de $0.10 por cada Kilómetro en exceso de 1000. Diseñe un programa que
calcule el monto a pagar por cada automóvil cobrado en un día de trabajo.
 */
package pkg5.compañia;
import javax.swing.*;

/**
 *
 * @author DRAKI_MB
 */
public class Compañia {
    
    public static void main(String[] args) {
        double Kmet;
        double Kex;
        double Tpagar;
        double montoex;
        String entrada;
        entrada = JOptionPane.showInputDialog("Escriba el total de km recorrido por el cliente: " );
        Kmet = Double.parseDouble(entrada);
        if(Kmet<=300){
            Tpagar=30;
            System.out.println("El monto total a pagar por el alquiler del vehículo es de: "+Tpagar);
            
        }
        else if(Kmet > 300 && Kmet<=1000){
            Kex=Kmet-300;
            montoex=Kex*0.15;
            Tpagar=30+montoex;
            System.out.println("El monto total a pagar por el alquiler del vehículo es de: "+Tpagar);
        }
        else if(Kmet<1000){
            Kex=Kmet-1000;
            montoex=Kex*0.10;
            Tpagar=30+montoex;
            System.out.println("El monto total a pagar por el alquiler del vehículo es de: "+Tpagar);
        }
    }
    
}
