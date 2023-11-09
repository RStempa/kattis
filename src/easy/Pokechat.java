package easy;

import java.util.Scanner;

public class Pokechat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encoding = in.nextLine();
        String idNumbers = in.nextLine();

        for (int i = 0; i < idNumbers.length(); i+=3) {
            String sub = idNumbers.substring(i, i + 3);
            int index = Integer.parseInt(sub.replaceFirst("^0+(?!$)", "")) - 1;
            System.out.print(encoding.charAt(index));
        }

    }
}
