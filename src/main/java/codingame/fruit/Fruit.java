package codingame.fruit;

import java.util.Set;
import java.util.TreeSet;

public class Fruit {

	public static void main(String args[]) {

		Set<Citron> c1 = new TreeSet<Citron>();
		Set<Orange> c2 = new TreeSet<Orange>();
		mordre(c1);
		mordre(c2);
	}

	public static void mordre(Set<? super Orange> c1) {
		// TODO Auto-generated method stub

	}

}

class Citron {

}

class Orange extends Citron {

}
