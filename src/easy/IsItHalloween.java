package easy;

import java.util.Objects;
import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

        if((Objects.equals(input[0], "OCT") && Objects.equals(input[1], "31")) ||
                (Objects.equals(input[0], "DEC") && Objects.equals(input[1], "25")))
            System.out.println("yup");
        else System.out.println("nope");
    }
}
