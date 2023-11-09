package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class KnotKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr = Integer.parseInt(in.nextLine());
        HashSet<String> knots = new HashSet<>(Arrays.asList(in.nextLine().split(" ")));
        knots.removeAll(new HashSet<>(Arrays.asList(in.nextLine().split(" "))));
        System.out.println(knots.stream().findFirst().get());
    }
}
