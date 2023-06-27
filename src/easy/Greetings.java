package easy;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            if(line.charAt(i) == 'e')
                System.out.print('e');
        }
    }
}
