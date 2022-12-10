package week1.day1;

public class StringReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amazonpadma goodgirl";
		char[] charArray = name.toCharArray();
		//char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i>=0; i--) {
			System.err.print(charArray[i]);
			
		}

	}

}
