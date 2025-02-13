import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                result.add(new int[]{0, i});
            }

            if (map.containsKey(sum)) {
                for (int index : map.get(sum)) {
                    result.add(new int[]{index + 1, i});
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 3, -1, 2, -2};
        List<int[]> result = findZeroSumSubarrays(nums);
        for (int[] subarray : result) {
            System.out.println("Subarray: [" + subarray[0] + ", " + subarray[1] + "]");
        }
    }
}