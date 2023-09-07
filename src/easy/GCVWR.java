package easy;

import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split(" ");
        int weight = (int) ((Integer.parseInt(line1[0]) - Integer.parseInt(line1[1])) * 0.9);
        String[] items = in.nextLine().split(" ");

        for (int i = 0; i < Integer.parseInt(line1[2]); i++) weight -= Integer.parseInt(items[i]);

        System.out.println(weight);
    }
}
