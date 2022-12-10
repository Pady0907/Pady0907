package week1.day1;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amazon Development Centre Chennai India";
		String[] words = name.split(" ");
		int length=words.length;
		for (int i =  words.length-1; i >=0; i--) 
			{
				System.out.print(words[i].toLowerCase()+ " ");

			}
			
		}

	}

	

