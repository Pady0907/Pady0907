package week1.day1;

public class FindletterE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hexaware";
		int count =0;
		char ch = 'e';
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]==ch)
			{
				count++;
			}
				
		}

		System.err.println(count);
	}

}
