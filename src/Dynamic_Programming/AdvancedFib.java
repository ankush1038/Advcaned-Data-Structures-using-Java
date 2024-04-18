package Dynamic_Programming;

import java.util.Scanner;

public class AdvancedFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n+1];
        d[0] = 1;
        d[1] = 2;
        for(int i=2;i<=n;i++){
            d[i] = d[i-1] + d[i-2];
        }
        for(int i=0;i<n;i++){
            for(int j = 0 ; j<=i; j++){
                if(j!=i){
                    System.out.print(d[j] + "*");
                }else{
                    System.out.print(d[j]);
                }
            }
            if(i<n-1){
                System.out.print(" + ");
            }
        }
    }
}
