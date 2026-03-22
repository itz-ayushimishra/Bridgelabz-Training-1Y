package com.gla.leetcode;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
        public void main() {
            int arr[] = {1, 0, 2, 0, 3, 0};
            Solution_283 s1 = new Solution_283();
            s1.moveZeroes(arr);
            System.out.println("After moving zeroes:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}