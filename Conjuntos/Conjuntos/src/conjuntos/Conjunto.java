
package conjuntos;


class Conjunto{
    
    private int bits;
    private String id;
    
public Conjunto(){
    bits=0;
    
} 
public Conjunto(String id){
bits = 0;
this.id=id;
}    
public void encenderBit(byte ele ){
bits = bits |(0x80000000>>>ele);

}    
public String toString(){
    String salida = "\n 01234567890123456789012345678901 \n";
    for (byte i = 0; i < 32; i++) {
        if ((bits & (0x80000000>>>i))!=0){
            
            salida+="1";
        }else
            salida+="0";
       
    }
 return salida;
        
}
}
