
package pilalibros;
import java.util.*;

public class Libro {
    private String titulo, autor;
    private int edicion;
    public Libro(){
        Scanner flujo = new Scanner(System.in);
                
    System.out.println(" Titutlo ");
         titulo= flujo.next();
    System.out.println(" Autor ");
         autor= flujo.next();
    System.out.println(" Edicion ");
         edicion= flujo.nextInt();
            
    }
    
 public String toString(){
     System.out.println("");
     String salida= "\n Titulo :" + titulo;
     salida="\n Autor :"+autor;
     salida=" \n Edicion :"+edicion;
     
 return salida;
 }
    
}
