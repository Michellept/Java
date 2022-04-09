
package experimento;
import java.util.Scanner;

class Experimento {
    
    
    public int nm,numero,num;
    public Dado uno,dos;
    public int frecuencias[] = new int [12];
    public int f[] =new int [num];
    
  
    
    
    private final int lanzamientos = (int) (Math.random()*25+1)+25;
    
    public Experimento {
        experimento.Dado uno = new Dado();
        experimento.Dado dos = new Dado();
        for (int lanza = 0; lanza < lanzamientos; lanza++){
        int tirada = uno.Lanzar()+dos.Lanzar();
        frecuencias[tirada-1]+=1;
        }
    }


    public  void mostrar(){
        System.out.println("\nValor\tFrecuencia");
        for(int i=0; i<12; i++)
            System.out.println((i+1)+"\t"+frecuencias[i]);
        
        for(int i=0; i<frecuencias.length; i++){
            if(frecuencias[i]>nm){ 
                nm = frecuencias[i]; 
        
    }
     
}
           System.out.println("La tirada con Mayor frecuencia es :  " + nm);
}

public void mostar2(){
    

    
Scanner leer = new Scanner(System.in);
    System.out.println("Numero de lanzamientos que deseas :");
     num = leer.nextInt();
    
    System.out.println("\nValor\tFrecuencia");
    
    for(int i=0; i<num; i++)
            System.out.println((i+1)+"\t"+frecuencias[i]);
        
        for(int i=0; i<f.length; i++){
            if(f[i]>nm){ 
                nm = f[i]; 


}
}
        System.out.println("La tirada con Mayor frecuencia es :  " + nm);
}

}