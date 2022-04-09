
package pilalibros;
public class PilaLibros {
    public static void main(String[] args) {
        
    Lista le = new Lista();
	le.Ins(new Libro());
	le.Ins(new Libro());
	le.Ins(new Libro());
	le.Ver();
	Libro sale = le.Del();
	System.out.println("\nSale " +
			  sale);
        	le.finalize();
    }

 
    }
    

