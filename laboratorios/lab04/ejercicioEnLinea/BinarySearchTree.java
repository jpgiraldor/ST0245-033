public class BinarySearchTree {

    private Node root;


    // Constructor sin parametros iniciar sin nodo
//    public BinarySearchTree() {
  //      this.root = null;
    //}
    //Contructor iniciando con nodo


    public BinarySearchTree(int n) {
        this.root = new Node(n);
    }

    //Llama al metodo auxiliar insertar
    public void insertar(int n) {
        insertarAux(root, n);
    }
    // Agrega un nodo al arbol
    private void insertarAux(Node node, int n) {
        if (node.data == n){
            return;
        }else if (n > node.data) {
            if (node.rigth == null) {
                node.rigth = new Node(n);
            }else {
                insertarAux(node.rigth, n);
            }
        }else {
            if (node.left == null) {
                node.left = new Node(n);
            }else {
                insertarAux(node.left, n);
            }
        }
    }

    // Llama al metodo auxiliar buscar
    public boolean buscar(int n) {
        return buscarAux(root, n);
    }

    //Busca en el arbol si existe un valor, devuelve true o false, dependiendo de si este o no
    private boolean buscarAux(Node node, int n) {
        if (node.data == n) {
            return true;
        }
        if (node == null) {
            return false;
        }
        if (n > node.data) {
            return buscarAux(node.rigth, n);
        }
        return buscarAux(node.left, n);
    }

    //Llama al metodo auxiliar borrar
    public void borrar(int n) {
        borrarAux(root, n);
    }

    //Borra un nodo el arbol
    private Node borrarAux(Node node, int n) {
        if (node == null) {
            return null;
        }
        if (node.data == n) {
            if (node.left == null && node.rigth == null) {
                return null;
            }
            if (node.rigth == null) {
                return node.left;
            }
            if (node.left == null) {
                return node.rigth;
            }else {
                node.data = encontrarNodoReemplazo(node.left);
            }
        }
        if (n > node.data) {
            node.rigth = borrarAux(node.rigth, n);
            return node;
        }
        node.left = borrarAux(node.left, n);
        return node;
    }

    private int encontrarNodoReemplazo(Node n) {
        if (n.rigth == null) {
            int res = n.data;
            n = null;
            return res;
        }
        return encontrarNodoReemplazo(n.rigth);
    }

    private static void imprimirPos(Node node){
        if(node!=null) {

            imprimirPos(node.left);
            imprimirPos(node.rigth);
            System.out.println(node.data);
            }
        }

    private static void imprimirLab(Node node){
        if(node!=null){

            imprimirLab(node.rigth);

            imprimirLab(node.left);
            System.out.println(node.data);

        }
    }

    private void imprimirLab1(){
        imprimirLab(root);
    }

    private void imprimirPo(){

        imprimirPos(root);
    }
    public static void main(String[]args){


        BinarySearchTree hi=new BinarySearchTree(4);

        //hi.insertar(50);
        //hi.insertar(20);
       // hi.insertar(4);
        hi.insertar(1);
        hi.insertar(9);
        hi.insertar(0);
        hi.insertar(2);
        hi.insertar(5);
        hi.insertar(11);
        hi.insertar(10);
        hi.insertar(13);
        hi.insertar(7);

        hi.imprimirPo();
        //hi.imprimirLab1();


    }
}