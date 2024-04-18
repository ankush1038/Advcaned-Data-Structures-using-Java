package Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci {
    // Iterative
    static int fib(int n){
        if(n==0 || n== 1){
            return  n;
        }
        int d[] =new int[n+1];
        d[0] = 0;
        d[1] = 1;
        for(int i=2; i<n+1;i++){
            d[i] = d[i-1] + d[i-2];
        }
        return d[n];
    }

    // Functional
    static int fib(int n, int[] d){
        if(n==0 || n==1){
            return n;
        }
        d[0]=0;
        d[1]=1;
        if(d[n]==-1){
            d[n]= fib(n-1,d) + fib(n-2,d);
        }
        return d[n];
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            d[i] = -1;
        }
        System.out.println(fib(n,d));
    }
}
