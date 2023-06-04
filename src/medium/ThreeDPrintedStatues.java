package medium;

import java.util.Scanner;

public class ThreeDPrintedStatues {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int statues = in.nextInt();
        int printers = 1;
        int days = 0;

        while(printers < statues) {
            days += 1;
            printers *= 2;
        }
        System.out.println(days + 1);
    }
}
