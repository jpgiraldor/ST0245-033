import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Banco {


    // seria mejor usar ArrayList
    public static void cajeros(List f1, List f2, List f3, List f4) {

        int cantidad = f1.size() + f2.size() + f3.size() + f4.size();
        LinkedList<List> filas = new LinkedList<>();
        filas.addAll(Arrays.asList(f1, f2, f3, f4));
        int sec = 0;
        int cajero = 1;

        while (cantidad > 0) {
            if (filas.get(sec).size() != 0) {
                System.out.println("Cliente " + filas.get(sec).get(0) + " en el cajero " + cajero);
                filas.get(sec).remove(0);
                cantidad--;
                if (sec == filas.size() - 1) {
                    sec = 0;
                }else {
                    sec++;
                }
                if (cajero == 1) {
                    cajero++;
                }else {
                    cajero--;
                }
            }else {
                filas.remove(sec);
            }
        }


    }

    public static void main(String[] args) {


        LinkedList<Cliente> f1 = new LinkedList<>();
        f1.addAll(Arrays.asList(new Cliente("Mateo"), new Cliente("Daniela"),new Cliente("Sofia")));

        LinkedList<Cliente> f2 = new LinkedList<>();
        f2.addAll(Arrays.asList(new Cliente("Pablo"), new Cliente("Nicolas"),new Cliente("Sara"),
                new Cliente("Camila")));

        LinkedList<Cliente> f3 = new LinkedList<>();
        f3.addAll(Arrays.asList(new Cliente("Alicia"), new Cliente("Juanita")));

        LinkedList<Cliente> f4 = new LinkedList<>();
        f4.addAll(Arrays.asList(new Cliente("Camilo"), new Cliente("Jaime"),new Cliente("Paulina")));

        cajeros(f1,f2,f3,f4);



    }
}

class Cliente {

    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

/*
 while(linea.indexOf("[") == 0 || linea.indexOf("]") == 0) {
            linea = linea.substring(1);
        }
        while(linea.lastIndexOf("[") == linea.length() - 1 || linea.lastIndexOf("]") == linea.length() - 1) {
            linea = linea.substring(0, linea.length() - 1);
        }

        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) == '[') {
                for (int j = i + 1; j < linea.length(); j++) {
                    if (j == linea.length() - 1) {
                        linea = linea.substring(i + 1) + linea.substring(0,i) + linea.substring(j);
                    }else if ()
                }
            }
        }
        return linea;
 */
