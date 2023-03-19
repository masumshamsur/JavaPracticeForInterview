package JavaInterviewPrip;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

       //Question 2:  Write a Java Program to count the number of characters in a given String.

public class countNumberOfChar {

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
		System.out.println(charMap);
		
	}

}
