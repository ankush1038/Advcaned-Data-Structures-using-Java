import java.util.PriorityQueue;

public class MaxSum {
    public static int maxSum(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
        }
        for (int i = 0; i < 4; i++) {
            int smallest = pq.poll();
            pq.offer(-smallest);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}

    class Pqueue {
        public static void main(String[] args) {
            int[] nums = {4, 2, 3};
            int maxSum = MaxSum.maxSum(nums);
            System.out.println("Maximum sum after 4 negations: " + maxSum);
        }
    }




















