package easy;

import java.util.Scanner;

public class CPRNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cpr = in.nextLine();
        cpr = cpr.replace("-", "");
        int total = 0;

        int j = 0;
        for (int i = 4; i >= 2 ; i--) {
            total += Integer.parseInt(String.valueOf((cpr.charAt(j)))) * i;
            j++;
        }
        for (int i = 7; i >=1 ; i--) {
            total += Integer.parseInt(String.valueOf((cpr.charAt(j)))) * i;
            j++;
        }
        int ok = total % 11 == 0 ? 1:0;
        System.out.println(ok);
    }
}
