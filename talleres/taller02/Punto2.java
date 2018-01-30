
/**
 * Write a description of class Punto2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto2
{
    public static boolean sumaGrupo(int start,int[]nums,int target){
        if(start==nums.length){
            return target==0;
        }
            else
                return sumaGrupo(start+1,nums,target)||sumaGrupo(start+1,nums,target-nums[start]);
    }
}
