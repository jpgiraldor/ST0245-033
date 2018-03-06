public class Taller7 {

    public static int max(LinkedListMauricio n) {
        return maxAux(n , 0);
    }

    private static int maxAux(LinkedListMauricio n, int index) {
        if (n.size() - 1 == index){
            return n.get(index);
        }
        int comp = maxAux(n,index + 1);
        return (n.get(index) > comp)? n.get(index):comp;
    }
    public static boolean compare(LinkedListMauricio n, LinkedListMauricio m){
        return compareAux(n,m,0);
    }

    private static boolean compareAux(LinkedListMauricio n, LinkedListMauricio m, int i) {
        if (n.size() == m.size()){
            while (n.get(i) == m.get(i)) {
                if (i == m.size() - 1){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
