package codingame.parenthese;

import java.util.EmptyStackException;
import java.util.Stack;

public class ChaineParethese {

	public static boolean isParenthese(String ch){
		if(ch.length()==1 || ch ==null){
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();

		try{	
			for(char c : ch.toCharArray()){
				if('('==c || '{'==c){
					stack.push(c);
				}
				else if('}'==c && stack.pop()!='{'){
					return false;
				}
				else if(')'==c && stack.pop()!='('){
					return false;
				}
			}
		} catch(EmptyStackException ex){
			return false;
		}
		return stack.isEmpty();
			
	}
	public static void main(String[] args) {
		System.out.println(isParenthese("{{}}"));
		System.out.println(isParenthese("{}}"));
		System.out.println(isParenthese("{{AA}}"));
	}

}
