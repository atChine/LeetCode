public class LCArray03 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] output = new int[nums.length];
        for (int i = 0 ;i < k;i++){
            for(int j = 0;j < nums.length;j++){
                if (j > 0){
                    output[j] = nums[j - 1];
                }else{
                    output[j] = nums[nums.length - 1];
                }
            }
            nums = output.clone();
        }
    }
}
