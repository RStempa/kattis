package easy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = Double.parseDouble(in.nextLine());
        int nrOfLawns = Integer.parseInt(in.nextLine());
        double total = 0.0;

        for (int i = 0; i < nrOfLawns; i++) {
            String[] heWi = in.nextLine().split(" ");
            total += (Double.parseDouble(heWi[0]) * Double.parseDouble(heWi[1]) * cost);
        }

        DecimalFormat df = new DecimalFormat("#.0000000");
        System.out.println(df.format(total));
    }
}
