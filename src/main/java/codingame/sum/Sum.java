package codingame.sum;

import java.math.BigDecimal;

public class Sum {

	static String sum(String ... numbers){
		BigDecimal total= new BigDecimal(0);
		for(String ch : numbers){
			total = total.add( new BigDecimal(ch));
		}
		return total.toString();
	}
	public static void main(String[] args) {
		System.out.println(sum("99.35","1.10"));
	}

}
