package Laboratorio;


/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto1
{
    public static void sum(int[]nums){
        System.out.println (sumAux1(nums,nums.length-1));
    }
   
    public static int sumAux1(int[] array, int index) {
    if (index == 0) {
        return array[0];
    } else {
        return array[index] + sumAux1(array, index - 1);
    }
    }
    public static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
            return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static void ArrayMax(int[]nums){
        recorrer(nums,0,nums[0]);
    }
    private static int recorrer(int[]nums, int i,int max){
        if (i==nums.length){
            System.out.println(max);
            return max;
        }
        if(nums[i]>max){max=nums[i];}
            return recorrer(nums,i+1,max);
    }
}
