package Laboratorio;

/**
 * Write a description of class Prueba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodingBat
{
    public int countX(String str) {
        if(str.length()==0)return 0;

        int sum=0;
        if(str.substring(0,1).equals("x"))sum=1;

        return sum+countX(str.substring(1));
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies==0)return bunnies;
        if(bunnies%2==1) return 2+bunnyEars2(bunnies-1);
        return  3+ bunnyEars2(bunnies-1);
    }

    public int fibonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public int bunnyEars(int bunnies) {
        if(bunnies==0)return bunnies;
        return 2+bunnyEars(bunnies-1);
    }

    public int factorial(int n) {
        if(n==1)return n;
        return n*factorial(n-1);
    }

}
