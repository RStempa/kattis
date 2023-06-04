package medium;

import java.util.Scanner;

public class TurtleMaster {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] lines = new String[8];

        for (int i = 7; i >= 0; i--) {
            lines[i] = in.nextLine(); // T börjar på 0.0
        }

        String instructions = in.nextLine();
        String result = play(instructions, lines);
        System.out.println(result);
    }

    private static String play(String instructions, String[] lines) {
        int[] pos = {0, 0}; // index, line
        int facing = 3;
        String theLine = lines[pos[1]];

        for (int i = 0; i < instructions.length(); i++) {
            if(instructions.charAt(i) == 'F') {
                if(facing == 3) {
                    pos[0] = pos[0] + 1;
                    if(pos[0] > 7) {
                        return "Bug!";
                    }
                    char place = theLine.charAt(pos[0]);
                    if(place == 'D')
                        return "Diamond!";
                    if(place != '.') {
                        return "Bug!";
                    }
                } else if (facing == 9) {
                    pos[0] = pos[0] - 1;
                    if(pos[0] < 0) {
                        return "Bug!";
                    }
                    char place = theLine.charAt(pos[0]);
                    if(place == 'D')
                        return "Diamond!";
                    if(place != '.') {
                        return "Bug!";
                    }
                } else if (facing == 12) {
                    pos[1] = pos[1] + 1;
                    if(pos[1] > 7)
                        return "Bug!";
                    theLine = lines[pos[1]]; // Change line up
                    char place = theLine.charAt(pos[0]);
                    if (place == 'D') {
                        return "Diamond!";
                    }
                    if (place != '.') {
                        return "Bug!";
                    }
                } else if (facing == 6) {
                    pos[1] = pos[1] - 1;
                    if(pos[1] < 0)
                        return "Bug!";
                    theLine = lines[pos[1]]; // Change line down
                    char place = theLine.charAt(pos[0]);
                    if (place == 'D') {
                        return "Diamond!";
                    }
                    if (place != '.') {
                        return "Bug!";
                    }
                }
            } else if (instructions.charAt(i) == 'R') {
                facing += 3;
                if(facing == 15)
                    facing = 3;
            } else if (instructions.charAt(i) == 'L') {
                facing -= 3;
                if(facing == 0)
                    facing = 12;
            } else if (instructions.charAt(i) == 'X') {

                if(facing == 3) {
                    if((pos[0] + 1) > 7) { // Shoot out of bounds to the right
                        return "Bug!";
                    }
                    if (theLine.charAt(pos[0] + 1) != 'I') { // Shoot other than Ice
                        return "Bug!";
                    } else {
                        theLine = theLine.substring(0,pos[0] + 1)+'.'+ theLine.substring(pos[0] + 2); // runtime out of bounds?
                    }
                } else if (facing == 9) {
                    if((pos[0] - 1) < 0) { // Shoot out of bounds to the left
                        return "Bug!";
                    } else if (theLine.charAt(pos[0] - 1) != 'I') { // Other than Ice
                        return "Bug!";
                    } else {
                        theLine = theLine.substring(0,pos[0] - 1)+'.'+ theLine.substring(pos[0]);
                    }
                } else if (facing == 12) {
                    if(pos[1] + 1 > 7)
                        return "Bug!";
                    else if (lines[pos[1] + 1].charAt(pos[0]) != 'I') {
                        return "Bug!";
                    } else {
                        lines[pos[1] + 1] = lines[pos[1] + 1].substring(0,pos[0])+'.'+ lines[pos[1] + 1].substring(pos[0] + 1);
                    }
                } else if (facing == 6) {
                    if(pos[1] - 1 < 0)
                        return "Bug!";
                    else if (lines[pos[1] - 1].charAt(pos[0]) != 'I') {
                        return "Bug!";
                    } else {
                        lines[pos[1] - 1] = lines[pos[1] - 1].substring(0,pos[0])+'.'+ lines[pos[1] - 1].substring(pos[0] + 1);
                    }
                }

            }
        }
        return "Bug!";
    }
}
