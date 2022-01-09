import java.util.HashMap;

public class LeetCode001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp) && hashMap.get(temp) != i) {
                result[0] = i;
                result[i] = hashMap.get(temp);
                return result;
            }
        }
        return result;
    }
}
