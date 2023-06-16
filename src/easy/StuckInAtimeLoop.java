package easy;

import java.util.Scanner;

public class StuckInAtimeLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + " Abracadabra");
        }
    }
}
