package easy;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = Integer.parseInt(in.nextLine());
        int number = 0;

        if(times % 2 != 0)
            System.out.println("still running");
        else {
            for (int i = 0; i < times; i+=2) {
                int nr1 = Integer.parseInt(in.nextLine());
                int nr2 = Integer.parseInt(in.nextLine());
                number += nr2 - nr1;
            }
            System.out.println(number);
        }
    }
}
