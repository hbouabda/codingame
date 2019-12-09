package codingame.concat;

public class ConcatString {

	public static String concat (String[] str){
		StringBuilder builder = new StringBuilder();
		for(String ch : str){
			builder.append(ch);
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		String[] arrays = {"a", "b","c"};
		System.out.println(concat(arrays));
	}

}
