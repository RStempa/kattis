package easy;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        StringBuilder nr1 = new StringBuilder(input[0]).reverse();
        StringBuilder nr2 = new StringBuilder(input[1]).reverse();

        String largest = String.valueOf(Integer.parseInt(nr1.toString()) > Integer.parseInt(nr2.toString()) ? nr1: nr2);
        System.out.println(largest);
    }
}
