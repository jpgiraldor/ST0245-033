import java.util.*;


public class Laboratory3 {


    /**
     * Returns the product of the numbers in the list.
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiply(List<Integer> list) {

        int cont = 1;
        for (int i : list) {
            cont *= i;
        }
        return cont;
    }

    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {


        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 2, 5, 8}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));


        // Multiply

        System.out.println(multiply(array));
        System.out.println(multiply(linked));


        //Insertar si no existe

        smartInsert(linked, 8);
        smartInsert(array, 9);

        print(linked);
        print(array);

        smartInsert(linked, 8);
        smartInsert(array, 9);

        print(linked);
        print(array);

        LinkedList<Integer> array2 = new LinkedList<>();


        //Posición pivote

        System.out.println("Mejor pivote en la posicion: " + posicionOptima(array2));


        LinkedList<Nevera> neveras = new LinkedList<>();

        neveras.add(new Nevera(1 , "Haceb"));
        neveras.add(new Nevera(2 , "LG"));
        neveras.add(new Nevera(3 , "IBM"));
        neveras.add(new Nevera(4 , "Haceb"));
        neveras.add(new Nevera(5 , "LG"));
        neveras.add(new Nevera(6 , "IBM"));
        neveras.add(new Nevera(7 , "Haceb"));
        neveras.add(new Nevera(8 , "LG"));
        neveras.add(new Nevera(9 , "IBM"));
        neveras.add(new Nevera(8 , "LG"));
        neveras.add(new Nevera(9 , "IMB"));


        LinkedList<Solicitud> solicitudes = new LinkedList<>();

        solicitudes.add(new Solicitud("Eafit" , 10));
        solicitudes.add(new Solicitud("La14" , 2));
        solicitudes.add(new Solicitud("Olimpica" , 4));
        solicitudes.add(new Solicitud("Exito" , 1));

        ejercicio4N(neveras,solicitudes);

        System.out.println();

        String linea  = "This_is_a_[Beiju]_text";
        String linea2 = "[[]][][]Happy_Birthday_to_Tsinghua_University";
        String linea3 = "asd[fgh[jkl";
        String linea4 = "asd[fgh[jkl[";
        String linea5 = "[[a[[d[f[[g[g[h[h[dgd[fgsfa[f";
        String linea6 = "asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg";

        tecladoRoto(linea);
        tecladoRoto(linea2);
        tecladoRoto(linea3);
        tecladoRoto(linea4);
        tecladoRoto(linea5);
        tecladoRoto(linea6);


    }

    public static void smartInsert(List list, int data) {

        if (!list.contains(data)) list.add(data);
    }

    public static void print(List list) {

        list.forEach(System.out::print);
        System.out.println();


    }

    public static int posicionOptima(List<Integer> lista) {
        int pivIndex = 0;
        int range = 0;

        for (int i = 0; i < lista.size(); i++) {
            int left = 0;
            int right = 0;
            for (int j = i; j < lista.size(); j++) {
                right += lista.get(j);
            }
            right -= lista.get(i);
            for (int j = 0; j < i; j++) {
                left += lista.get(j);
            }
            int range2 = Math.abs(left - right);
            if (i == 0) {
                range = right;
            }else if (range > range2) {
                range = range2;
                pivIndex = i;
            }

        }
        return pivIndex;
    }

    public static void ejercicio4(LinkedList<Nevera> nev, LinkedList<Solicitud> sol) {
        Collections.reverse(nev);
        Collections.reverse(sol);

        Iterator<Nevera> it = nev.iterator();

        for (Solicitud s : sol) {
            System.out.print(s + "{");
            while (it.hasNext() && s.getLoad() != 0) {
                s.loaded();
                System.out.print(it.next());
            }
            System.out.println("}");
        }
    }

    //Without class Collections
    public static void ejercicio4N(LinkedList<Nevera> nev, LinkedList<Solicitud> sol) {
        for (int i = sol.size() - 1; i >= 0; i--) {
            System.out.print(sol.get(i) + "{");
            for (int j = nev.size() - 1; sol.get(i).getLoad() != 0 && j >= 0; j--) {
                System.out.print(nev.get(j));
                sol.get(i).loaded();
                nev.remove(j);
            }
            System.out.println("}");
        }
    }

    public static void tecladoRoto (String linea) {

        String[] arr = linea.split("\\[");
        ArrayList<String> front = new ArrayList<>();
        front.addAll(Arrays.asList(arr));
        ArrayList<String> back = new ArrayList<>();

        Collections.reverse(front);

        for (int i = 0; i < front.size(); i++) {

            ArrayList<String> tmp = new ArrayList<>();
            arr = front.get(i).split("]");
            tmp.addAll(Arrays.asList(arr));
            if (arr.length > 1) {
                tmp.remove(0);
                Collections.reverse(tmp);
                back.addAll(tmp);
                front.remove(i);
                front.add(i, arr[0]);
                back.remove(arr[0]);
            }else if (arr.length == 0 || arr[0].equals(" ")) {
                front.remove(i);
                i--;
            }
        }

        Collections.reverse(back);
        front.addAll(back);

        front.forEach(System.out::print);
        System.out.println();
    }
}


class Nevera {
    private int code;
    private String description;

    public Nevera(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "(" + description + " , " + code + ")";
    }
}

class Solicitud {

    private String claimant;
    private int load;

    public Solicitud(String claimant, int load) {
        this.claimant = claimant;
        this.load = load;
    }

    public String getClaimant() {
        return claimant;
    }

    public int getLoad() {
        return load;
    }

    public void loaded() {
        load -= 1;
    }

    @Override
    public String toString() {
        return "(" + claimant + " , " + load + ")";
    }
}
