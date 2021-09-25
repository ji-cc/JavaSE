package qianxin;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,1};
        System.out.println(Arrays.toString(findNums(arr)));
    }
    public static int[] findNums (int[] nums) {
        // write code here
        Arrays.sort(nums);
        int[] res = new int[2];
        int sum = (1+nums.length)*nums.length/2;
        int cur_sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                res[0] = nums[i];
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            cur_sum +=nums[i];
        }
        res[1]= sum -(cur_sum-res[0]);
        Arrays.sort(res);
        return res;

    }
}
