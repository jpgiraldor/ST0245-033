import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash
{
    // Ojo, esta tabla definida así no permite manejar las colisiones
    private ArrayList<ArrayList<Pareja>> tabla;

    public UnaTablaDeHash(){
        tabla = new ArrayList<>(11);
        for (int i = 0; i < 10; i++) {
            tabla.add(new ArrayList<>(11));
        }
    }

    // Ojo, esta función hash es muy ingenua
    private int funcionHash(String k){
        return ((int) k.charAt(0)) % 10;
    }

    // Ojo con las colisiones
    public int get(String k){
        return tabla.get(funcionHash(k)).stream().filter(p -> p.name.equals(k)).collect(Collectors.toList()).get(0).dato;
    }

    // Ojo con las colisiones
    public void put(String k, int v){
        Pareja nueva = new Pareja(k,v);
        tabla.get(funcionHash(k)).add(nueva);

    }


    public static void main(String[] args) {
        UnaTablaDeHash n = new UnaTablaDeHash();

        n.put("Mateo", 1);
        n.put("Mariana", 2);
        n.put("Santiago", 3);
        n.put("Sara", 4);
        n.put("Camilo", 5);

        System.out.println(n.get("Mariana"));

    }
}
class Pareja {

    String name;
    int dato;

    public Pareja(String name, int dato) {
        this.name = name;
        this.dato = dato;
    }
}