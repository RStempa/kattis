package medium;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < cases; i++) {
            String line = in.nextLine();
            if(line.startsWith("simon says")) {
                if(line.length() > 10) {
                    String toDo = line.substring(10);
                    System.out.println(toDo.substring(1));
                } else System.out.println();
            } else System.out.println();
        }
    }
}
