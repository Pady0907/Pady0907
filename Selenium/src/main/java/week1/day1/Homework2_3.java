package week1.day1;

public class Homework2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Madam";
		String rev ="";
		char[] charArray = name.toCharArray();
		for (int j = charArray.length-1; j >=0 ; j--);
		{
			rev = rev + name;
		}
		if (name.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(name + " is a Palindrome String.");
		}
		else {
			System.out.println(name + " is not a Palindrome String.");
		}


	}

}


//output is right for madam but wrong for non palindrome. need help.