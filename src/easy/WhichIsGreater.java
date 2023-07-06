package easy;

import java.util.Scanner;

public class WhichIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        String output = (Integer.parseInt(input[0]) > Integer.parseInt(input[1])) ? "1": "0";
        System.out.println(output);
    }
}
