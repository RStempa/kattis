package easy;

import java.util.Scanner;

public class Jumbojavelin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr = Integer.parseInt(in.nextLine());
        int total = 0;

        for (int i = 0; i < nr; i++) {
            total += Integer.parseInt(in.nextLine());
        }
        System.out.println(total - nr + 1);

    }
}
