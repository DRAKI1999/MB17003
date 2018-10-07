/*MB17003
Diseñe un algoritmo que dados el peso y la altura de N personas que pertenecen a un
departamento de la república; obtenga el promedio del peso y de la altura de esta población.
 */
package pero_altura;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DRAKI_MB
 */
public class Pero_Altura {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double peso;
        double altura;
        int total;
  List<String> persona_peso = new ArrayList<>();
  List<String> persona_altura = new ArrayList<>();
  String opcion = null;
  String captu;
  double sumatoria_peso=0;
  double sumatoria_altura=0;
  do{
      captu = JOptionPane.showInputDialog("Digite el peso de la persona: " );
      //peso = Double.parseDouble(captu);
      persona_peso.add(captu);
      
      captu = JOptionPane.showInputDialog("Digite la altura de la persona: " );
      //altura = Double.parseDouble(captu);
      persona_altura.add(captu);
      
     opcion = JOptionPane.showInputDialog("Desea agregar datos de un nuevo habitante? S/N" );
     
 }while("S".equals(opcion) || "s".equals(opcion));
 total= persona_peso.size();
 //Salto de linea
        String nl=System.getProperty("line.separator");
 JOptionPane.showMessageDialog(null, "El total de personas a quienes se les han "+nl+"tomado datos son: "+nl+total);
 
        Iterator i = persona_peso.iterator();
         while(i.hasNext())
        {
            peso = Double.parseDouble((String) i.next());
            sumatoria_peso=sumatoria_peso+peso;
        }
         JOptionPane.showMessageDialog(null, "El promdio del peso total es: "+nl+sumatoria_peso/total);
         
         Iterator o = persona_altura.iterator();
         while(o.hasNext())
         {
            altura = Double.parseDouble((String)o.next());
            sumatoria_altura=sumatoria_altura+altura;
        }
       JOptionPane.showMessageDialog(null, "El promdio de la altura total es: "+nl+sumatoria_altura/total);
 }
}
