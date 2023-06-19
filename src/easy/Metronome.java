package easy;

import java.util.Scanner;

public class Metronome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ticks = in.nextInt();
        double revolutions = ticks / 4.0;
        System.out.println(revolutions);
    }
}
