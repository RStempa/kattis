package medium;

import java.util.Scanner;

public class Putovanje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] info = in.nextLine().split(" ");
        int foodNr = Integer.parseInt(info[0]);
        int volume = Integer.parseInt(info[1]);
        int[] foods = new int[foodNr];

        for (int i = 0; i < foodNr; i++) {
            foods[i] = in.nextInt();
        }

        int maxCount = 0;
        for (int i = 0; i < foods.length; i++) {
            int count = 0;
            int currentVolume = 0;

            int k = i;
            while (currentVolume <= volume && k < foods.length) {
                if(currentVolume + foods[k] <= volume) {
                    currentVolume += foods[k];
                    count++;
                }
                k++;
            }
            if(count > maxCount)
                maxCount = count;
        }
        System.out.println(maxCount);
    }
}

