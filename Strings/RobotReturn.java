// https://leetcode.com/problems/robot-return-to-origin/description/

public class RobotReturn {

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        moves = moves.toLowerCase();

        for (int i = 0; i < moves.length(); i++) {
            // System.out.println(moves.charAt(i));
            switch (moves.charAt(i)) {
                case 'u':
                    y++;
                    continue;
                case 'l':
                    x--;
                    continue;
                case 'r':
                    x++;
                    continue;
                case 'd':
                    y--;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDLRL"));
    }
}
