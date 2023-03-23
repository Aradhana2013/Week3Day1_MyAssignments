package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] word = test.toCharArray();
		
		
		for (int i = 0; i < word.length; i++) { 
			
			if(i%2 != 0) {//c=0,h=1,a=2,n=3,g=4,e=5,m=6,e=7
				
				String a = String.valueOf(word[i]);
				a = a.toUpperCase();
				System.out.print(a);
				
			}
			else
				System.out.print(word[i]);
			
		}

	}

}
