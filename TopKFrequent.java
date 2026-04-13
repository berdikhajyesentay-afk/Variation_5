import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (n1, n2) -> counts.get(n1) - counts.get(n2)
        );

        for (int num : counts.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        TopKFrequent solver = new TopKFrequent();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(solver.topKFrequent(nums, 2)));
    }
}