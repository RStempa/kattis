package medium;

import java.util.Scanner;

public class SantaKlas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int altitude = Integer.parseInt(input[0]);
        int angle = Integer.parseInt(input[1]);

        if((angle >= 0 && angle <= 180))
            System.out.println("safe");
        else if (angle == 270) {
            System.out.println(altitude);
        } else {
            System.out.println((int)(altitude * 1.0) / Math.sin((360 - angle) * 1.0));
        }

    }
}
