package JavaInterviewPrip;


 		/* Question 2
		   Print the reverse words of a string (INPUT : Alberstons is the best place  
		   Result should be snotsreblA si eht tseb ecalp */

public class reverseAString {

	public static void main(String[] args) {
		
		String str="Alberstons";
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
