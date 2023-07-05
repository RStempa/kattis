package easy;

import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = Integer.parseInt(in.nextLine());
        int i = 1;
        while(i <= times) {
            String word = in.nextLine();
            if(i % 2 != 0)
                System.out.println(word);
            i++;
        }
    }
}
