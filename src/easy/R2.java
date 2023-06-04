package easy;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] numbers = {Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        int output = 0;

        output = (numbers[1] * 2) - numbers[0];
        System.out.println(output);
    }
}
