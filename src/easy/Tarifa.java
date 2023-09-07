package easy;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mb = Integer.parseInt(in.nextLine());
        int months = Integer.parseInt(in.nextLine());
        int totalMb = mb * months;

        for (int i = 0; i < months; i++) {
            totalMb -= Integer.parseInt(in.nextLine());
        }

        System.out.println(totalMb + mb);
    }
}
