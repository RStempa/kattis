package easy;

import java.util.Scanner;

public class Fifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int changes = 0;
        int chPerYear = 0;

        for (int i = 0; i < 2; i++) {
            if (i == 0)
                changes = Integer.parseInt(in.nextLine());
            else
                chPerYear = Integer.parseInt(in.nextLine());
        }
        System.out.println(2022 + changes / chPerYear);
    }
}
