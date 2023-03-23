package week3.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "AMAZON";
		
		//to print in lower case
		//str=str.toLowerCase();
		
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);



		for(int i=charArray.length-1; i >= 0; i--) {
			//System.out.println(charArray[i]);
			
			//to print in same line, remove the ln after print
			System.out.print(charArray[i]);
		}

	}

}


