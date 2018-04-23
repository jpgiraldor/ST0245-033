public class ArbolGenealogico {

    private Nodo punta;
    private int tamaño;
    int altura;

    public ArbolGenealogico(String punta) {
        this.punta = new Nodo(punta);
        this.punta.orden = 1;
        tamaño = 1;
        altura = 1;
    }

    public ArbolGenealogico() {
        this.punta = null;
        tamaño = 0;
        altura = 0;
    }

    public void agregarFamiliar(boolean madre, String nombre, String hijo) {
        if (madre) {
            Nodo tmp = BuscarHijo(punta, hijo);
            tmp.madre = new Nodo(nombre);
            tmp.madre.orden = tmp.orden + 1;
            if (tmp.madre.orden > altura) {
                altura = tmp.madre.orden;
            }
            tamaño++;
        }else {
            Nodo tmp = BuscarHijo(punta, hijo);
            tmp.padre = new Nodo(nombre);
            tmp.padre.orden = tmp.orden + 1;
            if (tmp.padre.orden > altura) {
                altura = tmp.padre.orden;
            }
            tamaño++;
        }
    }

    private Nodo BuscarHijo(Nodo node, String de) {
        if (node == null) {
            return null;
        }
        if (node.name.equals(de)) {
            return node;
        }
        Nodo izq = BuscarHijo(node.madre,de);
        return izq == null? BuscarHijo(node.padre,de):izq;
    }


    public boolean buscar(String n) {
        return buscarAux(punta, n);
    }

    private boolean buscarAux(Nodo node, String nombre) {
        if (node == null) {
            return false;
        }
        if (node.name.equals(nombre)) {
            return true;
        }
        return buscarAux(node.madre, nombre) || buscarAux(node.padre, nombre);
    }
    public void imprimir() {
        imprimirAux(punta);
    }

    private void imprimirAux(Nodo punta) {
        if (punta == null){
            return;
        }
        System.out.print(punta.name + " " + "Padres; ");
        if (punta.padre != null) {
            System.out.print(punta.padre.name + " , ");
        }
        if (punta.madre != null) {
            System.out.print(punta.madre.name);
        }
        System.out.println();
        imprimirAux(punta.madre);
        imprimirAux(punta.padre);
    }

    public String abuelaMaterna(String nombre) {
        return abuelaMaternaAux(punta, nombre);
    }

    private String abuelaMaternaAux(Nodo punta, String nombre) {
        if (punta == null) {
            return null;
        }
        if (punta.name.equals(nombre)){
            return punta.madre.madre.name;
        }
        String der = abuelaMaternaAux(punta.padre,nombre);
        String izq = abuelaMaternaAux(punta.madre,nombre);
        return der != null ? der:izq;
    }
}

class Nodo {

    String name;
    Nodo padre, madre;
    int orden;

    public Nodo(String name) {
        this.name = name;
        this.padre = null;
        this.madre = null;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public void setMadre(Nodo madre) {
        this.madre = madre;
    }
}
