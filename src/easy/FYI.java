package easy;

import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        if(number.startsWith("555"))
            System.out.println("1");
        else System.out.println("0");
    }
}
