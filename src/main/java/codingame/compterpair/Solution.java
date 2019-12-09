package codingame.compterpair;

import java.util.Scanner;

public class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = 0;
		String[] strs = str.split("-");
		for (int i = 0; i < strs.length; i++) {
			String str2 = strs[i];
			count += str2.length() / 2;

		}
		System.out.println(count);

	}
}
