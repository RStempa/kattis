package easy;

import java.util.Scanner;

public class Leggjasaman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 2; i++) {
            total += Integer.parseInt(in.nextLine());
        }
        System.out.println(total);
    }
}
