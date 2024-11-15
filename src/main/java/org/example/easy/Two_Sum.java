package org.example.easy;

// URl: https://leetcode.com/problems/two-sum/

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == x){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
