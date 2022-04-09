
package arreglosmes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class AppArreglosMes {

  
    public static void main(String[] args) {
        Scanner flujo = new Scanner (System.in);
        float ventas[][] = new float [5][3];
        System.out.println(" Proporciona las ventas");
        
        for (byte d = 0; d <3; d++) {
            System.out.println(" Division " + (d + 1));
                for (byte m = 0; m < 5; m++) {
                    System.out.println("Mes" + (m+1));
                        ventas [m][d]= flujo.nextFloat();
                        
                
            }
        }
        float mayores[]= new float[3];
        byte meses[] = new byte[3];
        float mayoresm[]= new float[5];
        
         for (byte d = 0; d <3; d++) {// proceso
 
             for (byte m = 0; m <5; m++) {
            
                 if(ventas[m][d]>mayores[d]) {
                         mayores[d]=ventas[m][d];
                         meses[d]= (byte) (m + 1);
                     
                      } 
               
            }
                   }
           for (byte m = 0; m <5; m++) {// proceso para mostar mayor division por mes
 
             for (byte d = 0; d <3; d++) {
              
            
                 if(ventas[m][d]>mayoresm[d]) {
                         mayoresm[d]=ventas[m][d];
                         meses[d]= (byte) (m + 1);

                     System.out.println(""+meses[d]);
                                 }
             }
           }
                                 
        System.out.println(" \t Informe de ventas por division  \n \t  1 \t  2 \t  3");
         for (byte m = 0; m <5; m++) {
           //  System.out.println("Division " + (d+1));
                System.out.print(( m+1));
             for (byte d = 0; d < 3; d++) {
               System.out.print( "\t " + ventas[m][d]);
               
            }
         System.out.println();
      
        }
         System.out.println("Mayor\t"+Arrays.toString(mayores));
         System.out.println("Meses"+Arrays.toString(meses));
         System.out.println("Mayor division del mes "+ Arrays.toString(mayoresm));
     
    
    

              
   
    
    }// fin main
}//fin clase