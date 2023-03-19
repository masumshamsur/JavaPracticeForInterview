package JavaInterviewPrip;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*Sort and group by occurrence
{1000, 1001, 1002, 1003, 1000, 1000, 1002, 1005, 1006, 1003}
result should be {1000=3, 1001=1, 1002=2, 1003=2, 1005=1, 1006=1}*/

public class countDuplicateNumber {

	public static void main(String[] args) {
		
		int[] numbers= {1000, 1001, 1002, 1003, 1000, 1000, 1002, 1005, 1006, 1003};
		System.out.println("Array length is- " +numbers.length); //printing length
		
		Map <Integer, Integer> numMap= new HashMap<Integer, Integer>();
		
		for(Integer num:numbers) {
			if(numMap.containsKey(num)) {
				numMap.put(num, numMap.get(num)+1);
			}
			else {
				numMap.put(num, 1);
			}
		}
		System.out.println(numMap); // will print the sorted expected result
		
		// if we want to count the duplicate elements
		Set<Integer> keys= numMap.keySet();
		for(Integer num:keys) {
			if(numMap.get(num)>1) {
				System.out.println(num+" repited- "+numMap.get(num)+" times"); // will return the duplicate count
			}
		}
		}

	}


