package easy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line;

        while(in.hasNext()){
            line = in.nextLine().split(" ");
            if(line.length > 1)
            test(line);
        }
    }

    private static void test(String[] in) {
        int students = Integer.parseInt(in[0]);
        int total = 0;
        int average = 0;
        int overAv = 0;


        for (int i = 1; i < in.length; i++) {
            total += Integer.parseInt(in[i]);
        }
        average = total / students;
        for (int i = 1; i < in.length; i++) {
            if(Integer.parseInt(in[i]) > average) {
                overAv += 1;
            }
        }

        NumberFormat formatter = new DecimalFormat("#0.000");
        System.out.println(formatter.format((double) overAv/students * 100) + "%");
    }

}
