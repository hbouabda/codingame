package codingame.recopie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Recopie {

	static List<String> recopieElementAvantJava8(List<String> elements){
		List<String> result= new ArrayList<String>();
		
		for(String element : elements){
			if(element.matches("^[aA]*")){
				result.add(element);
			}
		}
		
		return result;
	}
	
	static List<String> recopieElementApresJava8(List<String> elements){
 
	    return elements.stream()
	           .filter(s -> s.matches("^[aA]*"))
	           .collect(Collectors.toList());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
