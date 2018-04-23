public class Main {

    public static void main(String[] args) {
        ArbolGenealogico miArbol = new ArbolGenealogico("Mateo");

        miArbol.agregarFamiliar(false, "Alberto", "Mateo");
        miArbol.agregarFamiliar(true, "Maria", "Mateo");
        miArbol.agregarFamiliar(true, "Alicia", "Maria");
        miArbol.agregarFamiliar(true, "Nora", "Alberto");

        miArbol.imprimir();
        System.out.println(miArbol.abuelaMaterna("Mateo"));

    }
}
