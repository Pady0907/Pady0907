package week1.day1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {2,5,7,7,5,9,2,3};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			//2==2
			/*2,2,3,5,5,7,7,9
			 * 2=2
			 * 2=3
			 * 3=5
			 * 5=5
			 * 5=7
			 * 7=7
			 * 7=9
			 */
			if (nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
			}



		}



	}

}
