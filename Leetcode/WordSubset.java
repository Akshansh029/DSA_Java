// https://leetcode.com/problems/word-subsets/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSubset {

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words1.length; i++) {
            HashSet<String> set = new HashSet<>();
            char[] charArr = words1[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                set.add(Character.toString(charArr[j]));
            }
            System.out.println(set);
            boolean isUniversal = true;
            for (String words21 : words2) {
                if (!set.contains(words21)) {
                    isUniversal = false;
                    break;
                }
            }
            System.out.println(isUniversal);
            if (isUniversal) {
                ans.add(String.valueOf(charArr));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        List<String> list = wordSubsets(words1, words2);
        System.out.println(list);
    }
}
