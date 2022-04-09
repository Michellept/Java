
package conjuntos;


public class AppConjuntos {

    
    public static void main(String[] args) {
    
        Conjunto set1 = new Conjunto("A");
        set1.encenderBit((byte)6);
        set1.encenderBit((byte)23);
        System.out.println(set1);
        
        Conjunto set2 = new Conjunto("B");
        set2.encenderBit((byte)7);
        set2.encenderBit((byte)30);
        System.out.println(set2);
        
        
    }
    
}
