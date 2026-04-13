import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > majorityCount) {
                return num;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solver.majorityElement(nums));
    }
}