
public class Taller3
{
    public static void hanoipto1(int n, char origen, char destino, char intermedio) {
        if(n==1) {
           System.out.println(origen+ "===>" + destino);
        } else {
            hanoipto1(n-1,origen,intermedio,destino);
            System.out.println(origen+ "===>" + destino);
            hanoipto1(n-1, intermedio, destino, origen);
        }
    }
    public static void combipto2(String base, String s) {
        if(s.length() == 0) {
            System.out.println(base);
        }else{
           combipto2(base + s.charAt(0), s.substring(1));
           combipto2(base, s.substring(1));
        }
    }
    
    public static void permutacionpto3(String base, String s) {
        if(s.length()==0) {
            System.out.println(base);
        } else {
            for(int i=0; i<s.length(); i++) {
                permutacionpto3(base + s.charAt(i), s.substring(0,i)+s.substring(i+1));
            }
        }
    }
    
    public static void main(String [] args) {
        //Punto 1 
        //hano1pto1(n, 'a', 'c','b'); 
        //Cambiar cadena para probar que sirve con cadenas largas.
        //combipto2(" ", "abc");
        //Cambiar cadena para probar que sirve con cadenas largas.
        //permutacionpto3(" ", "abc");        
    }
}
