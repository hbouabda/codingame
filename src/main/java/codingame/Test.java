package codingame;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class Test {

		static boolean check(String str) {
	
			if (str == null || str.length() == 0)
				return false; 
	
			Stack<Character> stack = new Stack<Character>();
			try {
				for (char currentCharacter : str.toCharArray()) {
					if (currentCharacter == '(' || currentCharacter == '[')
						stack.push(currentCharacter);
					else if (currentCharacter == ')' && stack.pop() != '(')
						return false;
					else if (currentCharacter == ']' && stack.pop() != '[')
						return false;
				}
			} catch (EmptyStackException e) {
				return false;
			}
			return stack.isEmpty();
		}

	public static void main(String args[]) {
		System.out.println(check(""));
		System.out.println(check(null));
		System.out.println(check("()"));
		System.out.println(check("([])"));
		System.out.println(check("(()]"));
		System.out.println(check("]"));
		System.out.println(check("]]"));
		System.out.println(check("]"));
	}

}