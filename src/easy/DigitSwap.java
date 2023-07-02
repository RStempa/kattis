package easy;

import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String code = in.nextLine();
        String code2 = code.charAt(1) + String.valueOf(code.charAt(0));
        System.out.println(code2);
    }
}
