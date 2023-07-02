package medium;

import java.util.Scanner;

public class SantaKlas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int altitude = Integer.parseInt(input[0]);
        int angle = Integer.parseInt(input[1]);

        if((angle >= 0 && angle <= 180) || angle == 360)
            System.out.println("safe");
        else if (angle <= 270) {
            int part1 = angle - 180;
            int part2 = 90 - part1;
            double procent = (double) part2 / 90;
            //System.out.println(procent + " procent");
            //double time = altitude + (altitude * procent);
            int time = (int) Math.round(altitude + (altitude * procent));
            //System.out.println(Math.round(time));
            System.out.println(Math.round(altitude/Math.cos(Math.toRadians(part2))));

        } else {
            int part1 = 360 - angle;
            int part2 = 90 - part1;
            double procent = (double) part2 / 90;
            //System.out.println(procent);
            //double time = altitude + (altitude * procent);
            int time = (int) Math.round(altitude + (altitude * procent));
            //System.out.println(time);
            //System.out.println(Math.round(time));
            System.out.println(Math.round(altitude/Math.cos(Math.toRadians(part2))));
        }
        // print(int(line[0]/math.cos(math.radians(a))))
    }
}
