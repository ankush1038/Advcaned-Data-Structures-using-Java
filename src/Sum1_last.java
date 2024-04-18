public class Sum1_last {
    public static void main(String[] args) {
        int [] n ={5,25,15,-10,-2,20};
        int min = findMin(n);
        int max = findMax(n);
        int sum = min+max;
        System.out.println(sum);
    }
    static int findMin(int [] n) {
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;
    }
    static int findMax(int[] n){
        int max = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>max){
                max = n[i];
            }
        }
        return max;
        }
    }

