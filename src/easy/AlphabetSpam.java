package easy;

import java.util.Scanner;

public class AlphabetSpam {

    public static void main(String[] args) {
        //alphabetSpam("Welcome_NWERC_participants!");
        //alphabetSpam("\\/\\/in_US$100000_in_our_Ca$h_Lo||ery!!!");
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        double total = line.length();
        double whiteSpace = 0;
        double upperCase = 0;
        double lowerCase = 0;
        double symbols = 0;

        for (int i = 0; i < total; i++) {
            //int charNr = (int) input.charAt(i);
            char curr = line.charAt(i);
            if (curr == '_') {
                whiteSpace += 1;
                //System.out.println("white ");
            } else if (curr >= 'A' && curr <= 'Z') {
                upperCase += 1;
                //System.out.println("upper ");
            } else if (curr >= 'a' && curr <= 'z') {
                lowerCase += 1;
                //System.out.println("lower ");
            } else {
                symbols += 1;
                //System.out.println("symbol ");
            }
        }
        System.out.println(whiteSpace/line.length()+System.lineSeparator()+lowerCase/line.length()+System.lineSeparator()+upperCase/line.length()+System.lineSeparator()+symbols/line.length());
    }
}
