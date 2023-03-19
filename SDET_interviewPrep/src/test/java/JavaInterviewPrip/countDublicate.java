package JavaInterviewPrip;

import java.util.HashMap;
import java.util.Set;

/*Question 3: Write a Java Program to 
find the duplicates of a given String. */

public class countDublicate{

	public static void main(String[] args) {
		
		String str="shamsurrahmanmasum";
		char[] chArray=str.toCharArray();
		
		HashMap<Character, Integer> charMap= new HashMap<Character, Integer>();
		
		for(Character ch:chArray) {
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		//System.out.println(charMap);
		
		Set<Character> keys= charMap.keySet();
		
		for(Character ch:keys) {
			if(charMap.get(ch)>1) {
				System.out.println(ch +" - repeted "+charMap.get(ch));
			}
		}

	}

}
