package easy;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        StringBuilder output = new StringBuilder();
        // 1 - input[i]
        for (int i = 0; i < 6; i++) {
            if(i == 0 || i == 1)
                output.append(1 - Integer.parseInt(input[i])).append(" ");
            else if (i == 2 || i == 3 || i == 4)
                output.append(2 - Integer.parseInt(input[i])).append(" ");
            else output.append(8 - Integer.parseInt(input[i]));
        }
        System.out.println(output);
    }
}
