package easy;

import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == 'a') {
                line = line.substring(i);
                break;
            }
        }
        System.out.println(line);
    }
}
