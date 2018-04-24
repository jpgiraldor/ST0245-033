import java.util.ArrayList;
//GRAFO CON LISTAS
public class DigraphAL
{
    int tmñ = 0;
    ArrayList[]nodo = new ArrayList[tmñ];
    
    public DigraphAL(int size) {
        this.tmñ = size;
    }
    public void addArc(int source, int destination, int weight){
        nodo[source].add(destination, weight);
    }
      public int getWeight(int source, int destination) {
        return (int) this.nodo[source].get(destination);
    }
     public ArrayList<Integer> getSuccessors(int vertice){
        return this.nodo[vertice];
    }
}
