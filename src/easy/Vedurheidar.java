package easy;

import java.util.Scanner;

public class Vedurheidar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int windSpeed = Integer.parseInt(in.nextLine());
        int nrOfRoads = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nrOfRoads; i++) {
            String[] road = in.nextLine().split(" ");
            int maxWind = Integer.parseInt(road[1]);
            System.out.println(maxWind < windSpeed ? road[0] + " lokud" : road[0] + " opin");
        }
    }
}
