package easy;

import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < cases; i++) {
            String[] line = in.nextLine().split(" ");
            int nights = Integer.parseInt(line[1]);
            int candles = 0;
            for (int j = 1; j <= nights; j++) {
                candles += j + 1;
            }
            System.out.println(line[0] + " " + candles);
        }
    }
}
