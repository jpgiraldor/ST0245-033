
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto2D
{
    private float x;
    private float y;

    public Punto2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float radio(){
        return (float) Math.sqrt((x*x)+(y*y));
    
    }


    double angulo(){
        return (float) Math.atan2(x, y);
    }
    String radioCoordenadaspolares(){
        return(Math.atan2(x, y)+" , "+Math.sqrt((x*x)+(y*y)));
    }
}
