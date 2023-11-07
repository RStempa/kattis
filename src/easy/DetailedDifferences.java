package easy;

import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < cases; i++) {
            String one = in.nextLine();
            String two = in.nextLine();
            System.out.println(one);
            System.out.println(two);
            for (int j = 0; j < one.length(); j++) {
                if(one.charAt(j) == two.charAt(j))
                    System.out.print(".");
                else System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}
