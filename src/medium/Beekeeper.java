package medium;

import java.util.Scanner;

public class Beekeeper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            String word = "";
            int highScore = -1;
            int cases = in.nextInt();
            if(cases == 0)
                break;

            for (int i = 0; i < cases; i++) {
                String current = in.next();
                if(count(current) > highScore) {
                    word = current;
                    highScore = count(current);
                }
            }
            System.out.println(word);
        }
        in.close();
    }

    private static int count(String line) {
        int count = 0;
        for (int i = 0; i < line.length() -1; i++) {
            if(line.substring(i, i + 2).equals("aa"))
                count++;
            if(line.substring(i, i + 2).equals("ee"))
                count++;
            if(line.substring(i, i + 2).equals("ii"))
                count++;
            if(line.substring(i, i + 2).equals("oo"))
                count++;
            if(line.substring(i, i + 2).equals("uu"))
                count++;
            if(line.substring(i, i + 2).equals("yy"))
                count++;
        }
        return count;
    }
}
