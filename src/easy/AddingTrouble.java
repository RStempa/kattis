package easy;

import java.util.Scanner;

public class AddingTrouble {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr1 = in.nextInt();
        int nr2 = in.nextInt();
        int nr3 = in.nextInt();

        if(nr1+nr2==nr3)
            System.out.println("correct!");
        else System.out.println("wrong!");

        in.close();
    }
}
