package easy;

import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] judges = in.nextLine().split(" ");
        int score = 0;
        int totJudges = Integer.parseInt(judges[0]);
        int voted = Integer.parseInt(judges[1]);

        for (int i = 0; i < voted; i++) {
            score += Integer.parseInt(in.nextLine());
        }

        double highest = (double) ((totJudges - voted) * 3 + score) / totJudges;
        double lowest = (double) ((totJudges - voted) * -3 + score) / totJudges;
        System.out.println(lowest + " " + highest);
    }
}
