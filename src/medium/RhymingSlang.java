package medium;
import java.util.ArrayList;
import java.util.Scanner;

public class RhymingSlang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int nrOfLists = Integer.parseInt(in.nextLine());
        ArrayList<String[]> wordLists = new ArrayList<>();

        for (int i = 0; i < nrOfLists; i++) {
            String[] list = in.nextLine().split(" ");
            for (String s: list) {
                if(word.endsWith(s)) {
                    wordLists.add(list);
                    break;
                }
            }
        }

        int nrOfPhrases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nrOfPhrases; i++) {
            String phrase = in.nextLine();
            boolean isRhyme = false;
            // continues after already found
            for (String[] currList : wordLists) {
                for (String s : currList) {
                    if (phrase.endsWith(s)) {
                        isRhyme = true;
                        break;
                    }
                }
            }
            if(isRhyme)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
