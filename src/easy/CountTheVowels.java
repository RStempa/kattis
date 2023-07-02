package easy;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class CountTheVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = toLowerCase(line.charAt(i));
            if(c == 'a' || c == 'o' || c == 'u' || c == 'e' || c == 'i')
                counter ++;
        }
        System.out.println(counter);
    }
}
