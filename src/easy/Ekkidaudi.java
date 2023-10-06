package easy;

import java.util.Scanner;

public class Ekkidaudi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split("[|]");
        String[] line2 = in.nextLine().split("[|]");

        for (int i = 0; i < line2.length; i++)
            System.out.print(line1[i] + line2[i] + " ");
    }
}
