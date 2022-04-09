
package reproductor;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


    public class AppReproductor {
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Cancion> BaseCanciones ;
    
    
public static void main(String[] args) throws FileNotFoundException {
        
       
        llenadoDeBaseCanciones();
        menu();
       
        
    }

         private static void llenadoDeBaseCanciones() throws FileNotFoundException {
     
        File archivo = new File("Lista.txt");
        Scanner leer = new Scanner(archivo);
 
        BaseCanciones = new ArrayList<>();
        
                while(leer.hasNext()){
       
                    BaseCanciones.add(new Cancion(leer));
            
        }
        
    }

    private static void menu() {
    System.out.println("Ingrese Una Opcion ");
    System.out.println("Ingrese la opcion deseada \n 1.Reproducir  \n 2.Añadir  \n 3. Salir");
    int opcion = teclado.nextInt();
    

          switch(opcion){
     
            case 1: Reproducir();    
              break;
            case 2: Añadir();
            break;
            
            case 3:  
            break;
            default:break;    
        
    }   
    }

    private static void Reproducir() {
        
       
        BaseCanciones = new ArrayList<>();
        Random ran = new Random(2);
            for (;;) {
                    System.out.println("Ingrese la opcion deseada \n 1.Reproducir Aleatorio \n 2.  \n 3. Salir");
                     int opcion = teclado.nextInt();
                    switch (opcion){
                            case 1: 
                                int posicion=ran.nextInt(1); //size optener posicion del largo del arreglo 
                                System.out.println("...Reproduciendo... \n ");
                               // BaseCanciones.get(posicion); 
                                System.out.println(BaseCanciones.get(posicion).getnombre());
                                System.out.println(BaseCanciones.get(posicion).getartista());
                                
                                break;
                            case 3:       
                             break;
                             
                             
            }
                    if (opcion==3) // salir del for infinito
                        break;
                    
                
        }
        
    }

    private static void Añadir() {
        
    }



   
}
