package codingame.robot;

import java.io.PrintStream;
import java.util.Scanner;

public class Player {

	public static String solve(int width, int height, int length, int mass) {

		boolean lourd = false;
		boolean encombrant = false;
		int volume = width * height * length;
		if (volume >= 1000000 || width >= 150 || height >= 150) {
			encombrant = true;
		}
		if (mass >= 20) {
			lourd = true;
		}

		if (lourd == true && encombrant == true) {
			return "REJECTED";
		} else if ((lourd == true && encombrant == false) || (lourd == false && encombrant == true)) {
			return "SPECIAL";
		} else {
			return "STANDARD";
		}
	}

	/* Ignore and do not change the code below */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			int width = in.nextInt();
			System.out.println("width = "+width);
			int height = in.nextInt();
			System.out.println("height = "+height);
			int length = in.nextInt();
			System.out.println("length = "+length);
			int mass = in.nextInt();
			System.out.println("mass = "+mass);
			PrintStream outStream = System.out;
			System.setOut(System.err);
			String action = solve(width, height, length, mass);
			System.setOut(outStream);
			System.out.println(action);
		}
	}

}