package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] splittext = test.split(" ");

		for (int i = 0; i < splittext.length; i++) {

			if(i%2!=0) {
				System.out.print(" " + splittext[i] + " ");
			} 
			else {
				char[] charArray = splittext[i].toCharArray();

				for (int j=charArray.length-1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
			}
		}

	}

}
