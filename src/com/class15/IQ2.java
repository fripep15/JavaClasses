package com.class15;

public class IQ2 {

	public static void main(String[] args) {
		// write jave program to fined second 
		
		int[] nums = {100, -90, 8787, 898, 0, 1, -90, 8787};
        int large = nums[0];
        int second = nums[0];
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]>large) {
                second = large;
                large = nums[i];
            }else if (nums[i]>second) {
                large = nums[i];
            }
        }System.out.println(second);

	}

}
