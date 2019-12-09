package codingame.nombredepair;

public class Solution {

	/** Counts the number of pairs for n players. */
	static int count(int n) {
		return n * (n - 1) / 2;
	}
}
