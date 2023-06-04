package easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Akcija {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfBooks = in.nextInt();
        Integer[] prices = new Integer[nrOfBooks];
        int total = 0;

        for (int i = 0; i < nrOfBooks; i++) {
            prices[i] = in.nextInt();
        }
        Arrays.sort(prices, Collections.reverseOrder());
        //Arrays.stream(prices).forEach(price -> System.out.println(price));

        double counter = 1;
        for (int i = 0; i < prices.length; i++) {
            if(!(counter % 3 == 0.0)) {
                total += prices[i];
            }
            counter += 1;
        }

        System.out.println(total);
    }
}
