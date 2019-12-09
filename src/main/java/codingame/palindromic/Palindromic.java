package codingame.palindromic;

public class Palindromic {

	static boolean palindromic(String ch){
		if(ch==null ){
			return false;
		}
		int n = ch.length();
		for(int i =0; i< n/2; i++){
			if(ch.charAt(i) != ch.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(palindromic("aca"));
	}

}
