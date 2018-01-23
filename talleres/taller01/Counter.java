
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Counter
{
    String id;
    double x;
    int y=0;
    Counter (String id){
        this.id=id;
    }
    void incrementar(){
        x=Double.parseDouble(id);
        x++;
        incrementos();
        imprimir();
    }
    void incrementos(){
        y++;
    }
    String imprimir(){
        id=Double.toString(x);
        return id;
    }
}