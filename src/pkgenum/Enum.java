
package pkgenum;

public class Enum {
    
    public enum Color{
    
        rojo,
        amarillo,
        verde
    }
    public void escribir(){}
    
    public static void main(String[] args) {
        Integer a=1;
        Enum n = new Enum();
        
        for(Color c : Color.values()){
            System.out.println("EL color es: "+c);
        }
        System.out.println("El color escogido es: "+Color.rojo);
        
        
        String s = "verde";
        System.out.println("El color que se usa es: "+Color.valueOf(s));
        
    }
    
}
