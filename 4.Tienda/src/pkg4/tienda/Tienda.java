/*MB17003
Una tienda ha puesto en oferta la venta de un producto, ofreciendo 15% de descuento por la
compra de 3 docenas y 10% en caso contrario. Además por la compra de más de 3 docenas se.
 */
package pkg4.tienda;
import javax.swing.*;


/**
 *
 * @author DRAKI_MB
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES-declaracion
        String nombre;
        int docenas;
        Double total1;
        Double total2;
        Double totalDes;
        Double precioDocena;
        String Captura;
        //
        
        nombre=JOptionPane.showInputDialog("Nombre del producto..." );
        
        Captura = JOptionPane.showInputDialog("Cuantidad de docenas..." );
        docenas = Integer.parseInt( Captura);
        
        Captura = JOptionPane.showInputDialog("Digite el precio de cada docena..." );
        precioDocena = Double.parseDouble(Captura);
        
        total1=precioDocena*docenas;
        
        if(docenas>=13){
            totalDes=total1*0.15;
            total2=total1-totalDes;
            System.out.println("El precio a cancelar es de: "+total2+ " por "+docenas+" docenas de "+nombre+" con un 15% de descuento por su compra"  );
        }
        else{
            totalDes=total1*0.10;
            total2=total1-totalDes;
            System.out.println("El precio a cancelar es de: "+total2+ " por "+docenas+" docenas de "+nombre+"con un 10% de descuento por su compra"  );
        }
    }
    
}
