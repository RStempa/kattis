package easy;

import java.util.Scanner;

public class Ahhh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String marioAh = "";
        String doctorAh = "";

        while(in.hasNext()) {
            marioAh = in.nextLine();
            doctorAh = in.nextLine();
            break;
        }

        if(marioAh.length() >= doctorAh.length())
            System.out.println("go");
        else System.out.println("no");
    }
}
