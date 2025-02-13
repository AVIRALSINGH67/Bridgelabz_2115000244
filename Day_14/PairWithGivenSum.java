import java.util.HashMap;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(target - num)) {
                return true;
            }
            map.put(num, 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        int target = 17;
        System.out.println("Has pair with given sum: " + hasPairWithSum(nums, target));
    }
}