package Dynamic_Programming;

import java.util.Scanner;

public class totalWays {

    static int totalWays(int n, int k){
        int [] ways = new int[n+1];
        if(n==1 || n==0){
            return 1;
        }
        int w = 0;
        for(int i=0;i<=k && n-i>0;i++){
            if(ways[n-i]==0){
                w += totalWays(n,k);
            }else{
                w += ways[n-i];
            }
        }
        ways[n] = w;
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(totalWays(n,k));
    }
}
