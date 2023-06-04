package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AFuriousCocktail {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split(" ");
        int timeToDrink = Integer.parseInt(line1[1]);
        Integer[] potions = new Integer[Integer.parseInt(line1[0])];
        String canDo ="";

        for (int j = 0; j < potions.length; j++) {
            potions[j] = in.nextInt();
        }
        Arrays.sort(potions, Collections.reverseOrder());

        int longestEffect = potions[0];
        for (int j = 1; j < potions.length; j++) {
            longestEffect -= timeToDrink;
            if(longestEffect > 0) {
                canDo = "YES";
            } else {
                canDo = "NO";
            }
        }
        System.out.println(canDo);
    }
}
