package easy;

import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        for (int i = 0; i < 3; i++) {
            System.out.print(word + " ");
        }
    }
}
