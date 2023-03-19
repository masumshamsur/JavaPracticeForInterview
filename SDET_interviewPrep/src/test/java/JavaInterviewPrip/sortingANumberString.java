package JavaInterviewPrip;


/* sorting a number string */

public class sortingANumberString {

	public static void main(String[] args) {
		
		String str= "76465489";
		char[] nums=str.toCharArray();
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				char tmp;
				if(nums[i]>nums[j]) {
					tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}		
			}
		System.out.println(nums);

	}

}
