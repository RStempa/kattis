package easy;

import java.util.Scanner;

public class TakeTwoStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if(input % 2 == 0)
            System.out.println("Bob");
        else System.out.println("Alice");
    }
}
