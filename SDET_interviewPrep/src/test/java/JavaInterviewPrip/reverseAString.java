package JavaInterviewPrip;


//Question 1: Write a Java Program to reverse a String.

public class reverseAString {

	public static void main(String[] args) {
		
		String str="good mornig";
		String rstr=" ";
		char ch;
		
		for(int i=0; i<str.length(); i++){
			ch= str.charAt(i);
			rstr= ch+rstr;
			/* logic here is-
			rstr=g+" "=g
			rstr=o+g=og
			rstr=o+og=oog 
			 */
		}
		System.out.println(rstr);
	}

}
