package medium;

import java.util.Arrays;
import java.util.Scanner;

public class TheDragonOfLoowater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s1 = in.nextLine();
            if(s1.equals("0 0")) {
                break;
            }
            String[] headsAndKnights = s1.split(" ");
            int nrOfHeads = Integer.parseInt(headsAndKnights[0]);
            int nrOfKnights = Integer.parseInt(headsAndKnights[1]);

            int[] heads = new int[nrOfHeads];
            int[] knights = new int[nrOfKnights];

            for (int i = 0; i < nrOfHeads; i++) {
                heads[i] = Integer.parseInt(in.nextLine());
            }

            for (int i = 0; i < nrOfKnights; i++) {
                knights[i] = Integer.parseInt(in.nextLine());
            }

            Arrays.sort(heads);
            Arrays.sort(knights);
            //test(heads, knights);

            // test another
            int cost = 0;
            int k = 0;
            int h = 0;
            while (h < nrOfHeads && k < nrOfKnights) {
                if (heads[h] <= knights[k]) {
                    cost += knights[k];
                    h++;
                    k++;
                } else if (heads[h] > knights[k]) {
                    k++;
                }
            }

            if (h < nrOfHeads) {
                System.out.println("Loowater is doomed!");
            } else {
                System.out.println(cost);
            }

        }
    }

/*    private static void test(Integer[] heads, Integer[] knights) {
        boolean possible = false;
        int total = 0;

        if(heads.length > knights.length) {
            System.out.println("Loowater is doomed!");
            return;
        }

        for (int i = 0; i < heads.length; i++) {
            int currentHead = heads[i];
            for (int j = 0; j < knights.length; j++) {
                int currentKnight = knights[j];
                if(currentKnight >= currentHead) {
                    total = total + currentKnight;
                    knights[j] = 0;
                    possible = true;
                    break;
                } else {
                    possible = false;
                }
            }
        }
        if(possible)
        System.out.println(total);
        else System.out.println("Loowater is doomed!");
    }*/

}
