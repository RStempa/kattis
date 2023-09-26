package easy;

import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";

        for(int i = 0; i < 2; ++i)
            s = in.nextLine();

        System.out.println(s.chars().filter(ch -> ch =='-').count());
    }
}
