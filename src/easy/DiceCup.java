package easy;

import java.util.Scanner;

public class DiceCup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] dice = in.nextLine().split(" ");
        int dice1 = Integer.parseInt(dice[0]);
        int dice2 = Integer.parseInt(dice[1]);
        int middle =  (dice1 + dice2 + 2) / 2;
        int range = Math.abs(dice1 - dice2);
        int start = middle - (range / 2);

        for (int i = start; i < start + range + 1; i++) {
            System.out.println(i);
        }
    }
}
