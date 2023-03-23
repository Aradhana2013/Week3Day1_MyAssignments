package week3.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";


		String[] split = text.split(" ");

		Set<String> mysentence = new LinkedHashSet<String>();

		for (int i = 0; i < split.length; i++) {
			
			mysentence.add(split[i]);
			
		}
		
		for (String DupRemoved : mysentence) {
			
			System.out.print(DupRemoved+ " ");
			
		}



	}

}









