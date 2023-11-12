package play;

import java.util.Arrays;
import java.util.List;



//External loops  before 8
//Internal loops -Java 8
public class ForEachMethod {

	public static void main(String args []) {
		
		
		List<Integer> values =Arrays.asList(1,2,3,4,5);
		
		//for each method, faster and can be used inside a collection
		values.forEach( i -> System.out.println(i));
	}
	
	
	
	
}
