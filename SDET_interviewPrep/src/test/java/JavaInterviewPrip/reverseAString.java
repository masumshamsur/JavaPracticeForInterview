package JavaInterviewPrip;

public class reverseAString {

	// Question 1: Write a Java Program to reverse a String.
	
	public static void main(String[] args) {
		
		String str="good mornig";
		String rstr=" ";
		char ch;
		
		for(int i=0; i<str.length(); i++){
			ch= str.charAt(i);
			rstr= ch+rstr;
			// rstr=g+" "=g
			//rstr=o+g=og
			//rstr=o+og=oog
		}
		System.out.println(rstr);
	}

}
