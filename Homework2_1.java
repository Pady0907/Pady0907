package week1.day1;

public class Homework2_1 {

	public static void main(String[] args) {
		String name = "changeme";
		String[] words = name.split(" ");
		char[] charArray = name.toCharArray();
		for (int j = 0; j < charArray.length; j++)
		{			
			char ch=name.charAt(j);
			if(j % 2 == 0) 
				ch=Character.toUpperCase(ch);
			name=name+ch;
		}
		System.out.println(""+name);


	}
}

//how to print in 2 lines?