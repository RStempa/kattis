package easy;

import java.util.Scanner;

public class Axpatiaaaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            while(i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1))
                i++;
        }
        System.out.println(output);
    }
}
