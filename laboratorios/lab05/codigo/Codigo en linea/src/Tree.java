import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class Tree {

    private Node first;
     ArrayList<Node> nodeList;

    public Tree(Node first) {
        this.first = first;
        nodeList = new ArrayList<>();
        nodeList.add(first);
    }

    public Tree() {
        nodeList = new ArrayList<>();
    }

    public void genTree(DigraphAM digraph) {
        first = new Node(digraph.getFirst());
        addNodeList(first);
        for (int i = 1; i <= digraph.size(); i++) {
            Node tmp = getNode(i);
            for (Integer integer : digraph.getSuccessors(i)) {
                Node tmp2 = getNode(integer);
                tmp.addSuccessor(tmp2);
            }
        }
    }

    public void genTree(DigraphAL digraph) {

    }

    public Node getNode(int dato) {
        Node result = new Node(dato);
        for (Node node : nodeList) {
            if (node.getDato() == dato) {
                result = node;
            }
        }
        addNodeList(result);
        return result;
    }

    public void addNodeList(Node node) {
        if (!contains(node.getDato())) {
            nodeList.add(node);
        }
    }
    public boolean contains(int dato) {
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).getDato() == dato) {
                return true;
            }
        }
        return false;
    }

    public void imprimir(Node node) {
        for (Node node1 : nodeList) {
            System.out.println(node1);
            System.out.println(node1.getSuccessors());
        }
    }


    public Node getFirst() {
        return first;
    }
}
