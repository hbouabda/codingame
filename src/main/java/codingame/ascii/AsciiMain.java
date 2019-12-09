package codingame.ascii;

public class AsciiMain {

    public static void main(String args[]) {

        String b = PrintChar.printchar('A');
        System.out.println(b);
        Character c = ScanChar.scanChar(b);
        System.out.println(c);
    }
}
