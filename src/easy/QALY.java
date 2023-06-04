package easy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int periods = Integer.parseInt(in.nextLine());
        //String[] lines = new String[periods];
        double output = 0.0;

        for (int i = 0; i < periods; i++) {
            String[] line = in.nextLine().split(" ");
            double[] doubles = {Double.parseDouble(line[0]), Double.parseDouble(line[1])};
            output += doubles[0] * doubles[1];
        }

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(output));

    }
}
