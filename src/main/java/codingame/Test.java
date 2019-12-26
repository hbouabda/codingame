package codingame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test implements Interface1, Interface2{

	public static void run(){
		Interface1.print1();
		Interface2.print1();
	}
	public static void main(String args[]) {
		
		List<String> ls = new ArrayList<>();
		ls.add("defg");
		ls.add("abcd");
		ls.stream().sorted((s1,s2) -> s1.compareTo(s2));
		
		ls.sort(Comparator.comparing(String::toString , (s1,s2)-> {
			return s1.compareTo(s2);
		}));
		
		Collections.sort(ls);
				
		System.out.println(ls.get(0));
		run();
		
		System.out.println("Apple".compareTo("Apple"));
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println( list.get(0) instanceof Object);
		System.out.println( list.get(1) instanceof Integer);
		System.out.println("strawberries".substring(2,5));
	}

}

interface Interface1{
	static void print1(){
		System.out.println("world");
	}
}

interface Interface2{
	
	static void print1(){
		System.out.println("hello");
	}
}