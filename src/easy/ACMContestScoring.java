package easy;

import java.util.*;

public class ACMContestScoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set rightLines = new HashSet<>();
        int minutes = 0;
        int penalty = 0;
        ArrayList<String> lines = new ArrayList<>();


        while (in.hasNextLine()) {
            String a = in.nextLine();
            if(a.equals("-1"))
                break;
            lines.add(a);
        }

        ArrayList<String> theCopy = new ArrayList<>(lines);

        for (String line: lines) {
            if(line.contains("right")) {
                String[] arr2= line.split(" ");
                minutes += Integer.parseInt(arr2[0]);
                //System.out.println(arr2[0] + " + correct min");
                rightLines.add(line);
                theCopy.remove(line);
            }
        }

        for (String line: theCopy) {
            String[] arr = line.split(" ");
            if(test(rightLines, arr[1])) {
                //System.out.println(Integer.parseInt(arr[0]) + " + wrong min");
                //minutes += Integer.parseInt(arr[0]);
                penalty += 20;
                //System.out.println(" +20 penalty");
            }
        }

        System.out.println(rightLines.size() + " " + (minutes+penalty));
        in.close();
    }

    public static boolean test(Set corr, String test) {

        for (Object correct: corr) {
            if(correct.toString().contains(test)) {
                return true;
            }
        }
        return false;
    }
}
