package easy;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String moves = in.nextLine();
        int pos = 1;

        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'A') {
                if(pos == 1) pos = 2;
                else pos = 1;
            } else if (moves.charAt(i) == 'B') {
                if(pos == 2) pos = 3;
                else pos = 2;
            } else if(moves.charAt(i) == 'C'){
                if(pos == 1) pos = 3;
                else pos = 1;
            }
        }
        System.out.println(pos);
    }
}
