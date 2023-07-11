package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MasteringMastermind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int colorPosition = 0;
        int color = 0;
        StringBuilder code = new StringBuilder(input[1]);
        StringBuilder guess = new StringBuilder(input[2]);
        ArrayList<Integer> toDel = new ArrayList<>();

        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == guess.charAt(i)) {
                colorPosition++;
                toDel.add(i);
            }
        }

        for (int i = toDel.size() - 1; i >= 0; i--) {
            code.deleteCharAt(toDel.get(i));
            guess.deleteCharAt(toDel.get(i));
        }

        char[] codeArr = code.toString().toCharArray();
        Arrays.sort(codeArr);
        char[] guessArr = guess.toString().toCharArray();
        Arrays.sort(guessArr);

        for (int i = 0; i < codeArr.length; i++) {
            if(codeArr[i] == guessArr[i]) color++;
        }

        System.out.println(colorPosition + " " + color);
    }
}
