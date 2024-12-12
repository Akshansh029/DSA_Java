
import java.util.Arrays;

//LeetCode 2337
public class MovePiecesForString {

    static void canChange(String start, String target) {
        if (start.length() != target.length()) {
            return;
        }
        char[] charArr = start.toCharArray();

        int s = 0;
        int e = charArr.length - 1;

        while (s <= e) {
            if (charArr[s] == 'L' && charArr[s - 1] == '_' && (s - 1) >= 0) {
                char temp = charArr[s];
                charArr[s] = charArr[s - 1];
                charArr[s - 1] = temp;
                s--;
            }
            if (charArr[s] == 'R' && charArr[s + 1] == '_' && (s + 1) < charArr.length) {
                char temp = charArr[s];
                charArr[s] = charArr[s + 1];
                charArr[s + 1] = temp;
                s++;
            }
            if (charArr[e] == 'L' && charArr[e - 1] == '_' && (e - 1) >= 0) {
                char temp = charArr[e];
                charArr[e] = charArr[e - 1];
                charArr[e - 1] = temp;
                e--;
            }
            if (charArr[e] == 'R' && charArr[e + 1] == '_' && (e + 1) < charArr.length) {
                char temp = charArr[e];
                charArr[e] = charArr[e + 1];
                charArr[e + 1] = temp;
                e++;
            }
            s++;
            e--;
        }

        System.out.println(Arrays.toString(charArr));

    }

    public static void main(String[] args) {
        canChange("_L__R__R_", "L______RR");
        canChange("R_L_", "__LR");
        canChange("_R", "R_");
    }
}
