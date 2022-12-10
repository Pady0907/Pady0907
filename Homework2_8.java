package week1.day1;

import java.util.Arrays;

public class Homework2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		int n=arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i+1)
			{

				System.out.println(arr[i]);
				break;
			}


		}

	}
}
//wrong answer. need help

