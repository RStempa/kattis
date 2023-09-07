package easy;

import java.util.Scanner;

public class EyeOfSauron {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line.length() % 2 == 0) {
            int pos1 = line.length() / 2 - 1;
            int pos2 = line.length() / 2;
            if(line.charAt(pos1) == '(' && line.charAt(pos2) == ')')
                System.out.println("correct");
            else System.out.println("fix");
        } else System.out.println("fix");
    }
}
