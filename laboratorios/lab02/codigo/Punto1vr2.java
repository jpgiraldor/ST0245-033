import java.util.Random;
/**
 * Write a description of class Punto1vr2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto1vr2
{
    
        public static void arraySum(int []nums){
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];

        }

    }

    public static int arrayMax(int[] nums){
        int x=nums[0];
        for (int i=0;i<nums.length;i++) {
            if(nums[i]>x)x=nums[i];
        }
        return x;
    }

    public static int[] insertionSort(int nums[]){
        int j;
        int w;
        for (int i = 1; i < nums.length; i++){
            w = nums[i];
            j = i-1;
            while (j >= 0 && nums[j] > w)
            {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = w;
        }
        return nums;
    }

    private static int[] mergeSort(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;        
        int L[] = new int [n1];
        int R[] = new int [n2];         
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];  
        int i = 0, j = 0;        
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }

    private static void sort(int arr[],int l, int r){
        {
            if (l < r)
            {

                int m = (l+r)/2;

                sort(arr, l, m);
                sort(arr , m+1, r);

                mergeSort(arr, l, m, r);
            }
        }
    }

    public static void mergeSort1(int arr[]){
        sort(arr,0,arr.length-1);
    }

    public static void main(String [] args) {

        for(int i = 25; i<=30; i++) {
            long startTime = System.currentTimeMillis();
            mergeSort1(f(1000000000));

            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(i+" "+ estimatedTime);
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

}
