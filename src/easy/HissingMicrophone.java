package easy;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        boolean hasHiss = false;

        for (int i = 0; i < line.length() - 1; i++) {
            if((line.charAt(i) == 's') && (line.charAt(i + 1) == 's')) {
                hasHiss = true;
                break;
            }
        }
        if(hasHiss)
            System.out.println("hiss");
        else System.out.println("no hiss");
    }
}

