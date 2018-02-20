import java.util.Random;
public class Taller5
{

   public static void tablas(int n) {
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
                //System.out.println(i+ "*" + j + "=" + i*j);
            }
        }
    }
    public static void main(String [] args) {
       for(int i = 100000; i<=100001; i++) {
                 long startTime = System.currentTimeMillis();
                tablas(i);
                //sum(f(10000));
                //insercion(f(10000));
              long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(i+" "+ estimatedTime);
            }
    }
    
    public static void sum(int[]nums){
            int suma = 0;
        for(int i = 0; i< nums.length; i++) {
            suma+=nums[i];
        }
    }
    public static int[] f(int size) {
        int max = 5000;
        int[] array = new int[size];
        Random generator = new Random();
        for (int i =0; i<size; i++)
            array[i] = generator.nextInt(max);
        return array;
    }
    
    public static void insercion(int[] nums) {
        for(int i = 0; i<= nums.length-1; i++) {
            int j = i;
            while(j>0 && nums[j-1]>nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j=j-1;
            }
        }
    }
}
 