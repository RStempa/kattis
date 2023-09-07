package easy;

import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr = Integer.parseInt(in.nextLine());
        int x = 0;

        for (int i = 0; i < nr; i++) {
            int addend = Integer.parseInt(in.nextLine());
            int pow = addend % 10;
            int num = addend / 10;
            x += Math.pow(num, pow);
        }
        System.out.println(x);
    }
}
