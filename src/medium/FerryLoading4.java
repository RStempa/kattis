package medium;

import java.util.Scanner;

public class FerryLoading4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] line = in.nextLine().split(" ");
            int ferryL = Integer.parseInt(line[0]) * 100;
            int arrivals = Integer.parseInt(line[1]);
            int counter = 0;
            int totCarL = 0;
            boolean leftSide = true;

            for (int j = 0; j < arrivals; j++) {
                String[] line2 = in.nextLine().split(" ");
                int carL = Integer.parseInt(line2[0]);
                String side = line2[1];

                if((leftSide && side.equals("left")) || (!leftSide && side.equals("right"))) {
                    totCarL += carL;
                    if(totCarL > ferryL) {
                        counter += 2;
                        totCarL = carL;
                    }
                } else {
                    counter += 1;
                    leftSide = !leftSide;
                    totCarL = 0;
                }
                if(j == arrivals - 1)
                    counter += 1;
            }
            System.out.println(counter);
        }
    }
}
