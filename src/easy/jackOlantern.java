package easy;

import java.util.Scanner;

public class jackOlantern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] combos = in.nextLine().split(" ");
        System.out.println(Integer.parseInt(combos[0]) * Integer.parseInt(combos[1]) * Integer.parseInt(combos[2]));
    }
}
