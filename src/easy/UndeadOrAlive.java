package easy;

import java.util.Scanner;

public class UndeadOrAlive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if(input.contains(":)") && input.contains(":("))
            System.out.println("double agent");
        else if (input.contains(":)")) {
            System.out.println("alive");
        } else if (input.contains(":(")) {
            System.out.println("undead");
        } else
            System.out.println("machine");
    }
}
