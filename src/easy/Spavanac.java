package easy;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        // - 45 + 60
        if(Integer.parseInt(input[1]) >= 45)
            System.out.println(input[0] + " " + (Integer.parseInt(input[1]) - 45));
        else {
            if(Integer.parseInt(input[0]) == 0)
                input[0] = "24";
            System.out.println(Integer.parseInt(input[0]) - 1 + " " + (Integer.parseInt(input[1]) - 45 + 60));
        }
    }
}
