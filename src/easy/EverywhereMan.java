package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EverywhereMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < cases; i++) {
            Set<String> all = new HashSet<>();
            int citys = Integer.parseInt(in.nextLine());
            for (int j = 0; j < citys; j++) {
                all.add(in.nextLine());
            }
            System.out.println(all.size());
        }
    }
}
