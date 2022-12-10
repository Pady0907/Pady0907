package week1.day1;

public class Homework2_4 {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] words = text.split(" ");
		char[] charArray = text.toCharArray();			
		for (int i = 0; i < charArray.length; i++) {

			if(charArray[i]==count)
			{
				count++;
			}
			else if(count>1)
			{
			text=""	;
			}
		}

		System.err.println(text);
	}
}

// Need help

