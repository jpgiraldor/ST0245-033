import java.util.Random;

public class LabP1a {

    public static void main(String[] args) {
        int n [] = new int[100000];  //Se modifica el tamaño
        Random k = new Random();
        for (int i = 0; i < 100000; i++) {  // Se modifica el tamaño
            n[i] = i;
        }
        long startTime = System.currentTimeMillis();
        System.out.println(arrayMax(n));
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);
    }

    public static int arrayMax(int [] arr) {
        return arrayMaxAux(arr, 99999); //500
    }

    private static int arrayMaxAux(int [] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int sec = arrayMaxAux(arr, n - 1);
        return (arr[n] > sec)? arr[n]: sec;
    }

    public static long ArraySum(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
