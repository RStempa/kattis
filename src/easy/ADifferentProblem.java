package easy;

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            long absDiff = Math.abs(a-b);
            System.out.println(absDiff);
        }

    }
}
