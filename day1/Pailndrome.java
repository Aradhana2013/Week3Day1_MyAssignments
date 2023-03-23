package week3.day1;

public class Pailndrome {

	public static void main(String[] args) {
		String original = "madam";
		String reverse = "";

		for (int i = original.length()-1; i >= 0; i--) {
			
         reverse = reverse + original.charAt(i);        

		}

		if (original.equals(reverse)) {
			System.out.println("Given String is a Palindrome");
		}

		else
			System.out.println("Given String is not a Palindrome");
	}

}
