package easy;

import java.util.Scanner;

public class Spritt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int total = 0;

        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            total += Integer.parseInt(in.nextLine());
        }
        System.out.println(total <= Integer.parseInt(input[1]) ? "Jebb": "Neibb");
    }
}
