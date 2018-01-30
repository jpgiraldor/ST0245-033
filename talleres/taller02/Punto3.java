
public class Punto3
{
    public static void combi(String base, String s) {
        if(s.length() == 0) {
            System.out.println(base);
        }else{
           combi(base + s.charAt(0), s.substring(1));
           combi(base, s.substring(1));
        }
    }
    public static void main(String [] args) {
        combi(" ", "abc");
    }
}
