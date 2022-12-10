package week1.day1;

import java.util.Iterator;

public class HomeWork_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum =0,secNum=1,sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < 11; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);

		}

	}

}


