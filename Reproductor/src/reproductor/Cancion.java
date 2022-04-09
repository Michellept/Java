
package reproductor; // Padre

import java.util.Scanner;


public class Cancion {
    
    // a ederar
    private String nombre;
    private int año;
    String artista;
    
    
    public Cancion(){
        
    }
   
    public Cancion(Scanner leer){
        nombre = leer.next();
        artista = leer.next();
        año = leer.nextInt();
    }
    
    public String getnombre(){ 
         return nombre;
    }
     public String getartista(){
        return artista;
    }
     public int año(){
      return año;
    }
    
    
     public String toString(){
        return nombre +"\t"+artista +"\t" + año + "\t";
    }
    
    
}
