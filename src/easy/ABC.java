package easy;

import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        String order = in.nextLine();
        String output = "";
        int[] ints = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            ints[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(ints);

        for (int i = 0; i < order.length(); i++) {
            String current = String.valueOf(order.charAt(i));
            if(current.equals("A")) {
                output += ints[0] + " ";
            } else if (current.equals("B")) {
                output += ints[1] + " ";
            } else {
                output += ints[2] + " ";
            }
        }

        System.out.println(output.trim());
    }
}
