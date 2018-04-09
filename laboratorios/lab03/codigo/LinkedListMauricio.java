import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista circular doblemente enlazada
public class LinkedListMauricio {



    private Node first;
    private Node lastOne;
    private int size;

    public LinkedListMauricio()
    {
        size = 0;
        first = null;
        lastOne = null;
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {

        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        if (size == 0) {
            return 999999;
        }

        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size() {
        return size;
    }

    // Inserta un dato en la posición index

    public void insert(int data, int index) throws IndexOutOfBoundsException {
        if (index >= 0) {
            insertAux(data,index);
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    private void insertAux(int data, int index) {
        Node nuevo = new Node(data);
        int cont = 0;

        if (first == null) {
            lastOne = nuevo;
            first = nuevo;
            first.next = lastOne;
            first.preceding = first;
            size++;
        }else if (index == 0) {
            nuevo.next = first;
            nuevo.preceding = lastOne;
            first = nuevo;
            size++;
        }else if (index > size) {
            nuevo.preceding = lastOne;
            nuevo.next = first;
            lastOne.next = nuevo;
            lastOne = nuevo;
            size++;
        }else {
            Node tmp = first;
            while (cont < index) {
                tmp = tmp.next;
                cont++;
            }
            nuevo.preceding = tmp.preceding;
            tmp.preceding.next = nuevo;
            nuevo.next = tmp;
            tmp.preceding = nuevo;
            size++;
        }
    }

    // Borra el dato en la posición index
    public void remove(int index) {
        if (size == 0) {
            return;
        }
        if (index == 0) {
            first.next.preceding = lastOne;
            lastOne.next = first.next;
            first = first.next;
            size--;
        }else {
            Node rem = first;
            while (index != 0) {
                rem = rem.next;
                index--;
            }
            rem.preceding.next = rem.next;
            rem.next.preceding = rem.preceding;
            size--;
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data) {
        if (size == 0) {
            return false;
        }
        Node temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListMauricio n = new LinkedListMauricio();

        n.insert(3,0);
        n.insert(1,1);
        n.insert(2,2);
        n.insert(4,3);
        n.insert(5,2);
        n.remove(2);

        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }

}

// Un nodo para una lista circular doblemente enlazada
class Node {


    public int data;
    public Node next;
    public Node preceding;

    public Node(int data)
    {
        next = this;
        preceding = this;
        this.data = data;
    }

}