
package experimento;

public class Dado {
    
    
        private int valor;
    public Dado(){
        valor = 1;
    }
    public int Lanzar(){
       valor = (int) (Math.random()*6+1); // el 1 es para que no salga 0, pero hace que si el dado cae en 1 entonces sera dos, por lo tanto nunca va a tener f en 1
       return valor;
    }
} 
