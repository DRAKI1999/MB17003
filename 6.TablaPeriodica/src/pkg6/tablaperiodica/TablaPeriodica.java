/*MB17003
Se tiene un grupo de datos relativos a los elementos de la tabla periódica de química. 
Por cada elemento se ingresa su nombre, su conductividad eléctrica y su conductividad térmica.Diseñe un algoritmo para calcular lo siguiente:
• Los dos principales elementos conductores de la electricidad y el calor.
• Los dos peores elementos conductores de la electricidad y el calor.
 */
package pkg6.tablaperiodica;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author DRAKI_MB
 */
public class TablaPeriodica {
    public static void main(String[] args) {
        //**************************************************
        String nombre;
        String cone;
        String cont;
        int contuctividadE;
        int conductiT;
        String op = null;
        List<String> nombres = new ArrayList<>();
        List<String> conductividad_Elec = new ArrayList<>();
        List<String> conductividad_Ter = new ArrayList<>();
        double mayor2;
        double menor2;
        int longitud;
        //***************************************************
        do{
        nombre = JOptionPane.showInputDialog("Nombre: " );
        nombres.add(nombre);
        cone = JOptionPane.showInputDialog("Conductividad Electrica: " );
        conductividad_Elec.add(cone);
        cont = JOptionPane.showInputDialog("Conductividad Termica: " );
        conductividad_Ter.add(cont);
        op = JOptionPane.showInputDialog("Precione *S* si desea agregar un nuevo elemento" );
        }while("S".equals(op) || "s".equals(op));
        
        //***********************************************
        Iterator n = nombres.iterator();
        Iterator e = conductividad_Elec.iterator();
        Iterator c = conductividad_Ter.iterator();
        //***********************************************
         while(n.hasNext() && e.hasNext() && c.hasNext())
        {
            System.out.println("________________________________________");
            System.out.println("\nNombre: ");
            System.out.println(n.next());
            System.out.println("Conductividad electrica: ");
            System.out.println(e.next());
            System.out.println("Conductividad termica: ");
            System.out.println(c.next());
            System.out.println("________________________________________");
        } 
        int iPosicion;
//*************************************************
        
        double iNumeroMayor = Double.parseDouble(conductividad_Elec.get(0));
        double iNumeroMenor = Double.parseDouble(conductividad_Elec.get(0));
        iPosicion = 0;
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        for(int o=0;o<2;o++){
        for (int x=1;x<conductividad_Elec.size();x++){
            double aux = Double.parseDouble(conductividad_Elec.get(x));
            if (aux>iNumeroMayor){
                iNumeroMayor = aux;
                iPosicion = x;
                System.out.println("\nConductividad electrica mayor: ");
                System.out.println(nombres.get(x));
            }
        
        }
    }
    for(int o=0;o<2;o++){
        for (int x=1;x<conductividad_Elec.size();x++){
            double aux = Double.parseDouble(conductividad_Elec.get(x));
            if (aux<iNumeroMenor){
                iNumeroMenor = aux;
                iPosicion = x;
                System.out.println("\nConductividad electrica menor: ");
                System.out.println(nombres.get(x));
            }
        
        }
    }
    //****************************************************
        iNumeroMayor = Double.parseDouble(conductividad_Ter.get(0));
        iNumeroMenor = Double.parseDouble(conductividad_Ter.get(0));
        iPosicion = 0;
        for(int o=0;o<2;o++){
        for (int x=1;x<conductividad_Ter.size();x++){
            double aux = Double.parseDouble(conductividad_Ter.get(x));
            if (aux>iNumeroMayor){
                iNumeroMayor = aux;
                iPosicion = x;
                System.out.println("\nConductividad termica mayor: ");
                System.out.println(nombres.get(x));
            }
        
        }
    }
    for(int o=0;o<2;o++){
        for (int x=1;x<conductividad_Ter.size();x++){
            double aux = Double.parseDouble(conductividad_Ter.get(x));
            if (aux<iNumeroMenor){
                iNumeroMenor = aux;
                iPosicion = x;
                System.out.println("\nConductividad termica menor: ");
                System.out.println(nombres.get(x));
            }
        
        }
    }
    //******************************************************
    }
    
}
