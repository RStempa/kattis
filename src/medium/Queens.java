package medium;

import java.util.Arrays;
import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] points = new int[n][];
        String out = "CORRECT";

        for (int i = 0; i < n; i++) {
            String[] line = in.nextLine().split(" ");
            int[] point = {Integer.parseInt(line[0]), Integer.parseInt(line[1])};
            points[i] = point;
        }

        Arrays.sort(points, (p1, p2) -> {
            if(p1[0] == p2[0])
                return p1[1] < p2[1] ? -1 : 1;
            return p1[0] < p2[0] ? -1 : 1;
        });

        // (y2 - y1) / (x2 - x1)
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int x1 = point[0], y1 = point[1];
            int x2 = point[0] + 1, y2 = point[1] + 1;
            double slope = (double) (y2 - y1) / (x2 - x1); // Must check down slope too
            // Must be way to easy reverse slope
        }
    }
}

