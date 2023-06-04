package medium;

import java.util.Scanner;

public class WordsForNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String output = "";
        String[] lower = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");

            for (int i = 0; i < line.length; i++) {
                String aNUmber = "";

                if (Character.isDigit(line[i].charAt(0))) {
                    int theNr = Integer.parseInt(line[i]);
                    if (theNr < 20) {
                        aNUmber += lower[theNr];
                    } else if (theNr % 10 == 0) {
                        aNUmber += tens[theNr / 10 - 2];
                    } else {
                        int secondDigit = theNr % 10;
                        theNr /= 10;
                        aNUmber += tens[theNr - 2] + "-" + lower[secondDigit].toLowerCase();
                    }
                    if (i == 0)
                        line[i] = aNUmber;
                    else
                        line[i] = aNUmber.toLowerCase();
                }
            }
            for (int i = 0; i < line.length; i++) {
                if (i == line.length) {
                    output += System.lineSeparator();
                }
                output += line[i] + " ";
            }
            System.out.println(output);
            output = "";
        }

    }
}
