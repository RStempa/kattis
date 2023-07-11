package easy;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = in.nextLine().split("-");
        StringBuilder shortVar = new StringBuilder();

        for (String s: name) {
            shortVar.append(s.charAt(0));
        }
        System.out.println(shortVar);
    }
}
