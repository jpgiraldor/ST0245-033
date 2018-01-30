
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto1
{
    public static int MCD(int a, int b){
        int res=a%b;
        if (res==0) 
            return b;
        return MCD(b,res);
    }
}
