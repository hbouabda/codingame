package codingame.echo;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split(" ");
        for (String str1 : strs) {
            System.out.println(str1);
        }
    }
}
