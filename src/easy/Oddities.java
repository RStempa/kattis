package easy;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = Integer.parseInt(in.nextLine());

        for (int i = 0; i < tests; i++) {
            int num = Integer.parseInt(in.nextLine());
            String test =  num % 2 == 0 ? num + " is even": num + " is odd";
            System.out.println(test);
        }
    }
}
