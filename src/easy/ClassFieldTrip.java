package easy;

import java.util.Arrays;
import java.util.Scanner;
public class ClassFieldTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] together = (in.nextLine() + in.nextLine()).toCharArray();
        Arrays.sort(together);
        for (char c : together) {
            System.out.print(c);
        }
    }
}
