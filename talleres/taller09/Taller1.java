import java.util.*;
/**
 *
 * @author cl18412
 */
public class Taller1 {

    public static boolean Punto3(HashMap empresas, String buscar){
        System.out.println(empresas.containsKey(buscar));
        return empresas.containsKey(buscar);
    }

    public static boolean Punto4(HashMap empresas,String pais){
        System.out.println(empresas.containsValue(pais));
        return empresas.containsValue(pais);
    }

    public static void main(String[] args) {
        HashMap empresas=new HashMap();
        empresas.put("Google","Estados Unidos");
        empresas.put("La locura","Colombia");
        empresas.put("Nokia", "Finlandia");
        empresas.put("Sony","Japon");

        Punto3(empresas,"Google");
        Punto3(empresas,"Motorola");

        Punto4(empresas,"India");
        Punto4(empresas,"Estados Unidos");
    }

}