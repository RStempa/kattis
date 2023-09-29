package easy;

import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option1 = Integer.parseInt(in.nextLine());

        System.out.printf("%.10f%n", 100.0 / option1);
        System.out.printf("%.10f%n", 100.0 / (100 - option1));
    }
}
