package medium;

import java.util.Scanner;

public class NinetyNineProblems {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nrIn = in.next();
        int out = 0;
        int theLastDigits;

        if(nrIn.length() < 3) {
            //theLastDigits = Integer.parseInt(nrIn);
            out = 99;
        }
        else {
            theLastDigits = Integer.parseInt(nrIn.substring(nrIn.length()-2, nrIn.length()));
            if(theLastDigits < 49) {
                out = Integer.parseInt(nrIn) - theLastDigits - 1;
            }
            else {
                out = Integer.parseInt(nrIn) - theLastDigits + 99;
            }
        }
        System.out.println(out);

    }
}
