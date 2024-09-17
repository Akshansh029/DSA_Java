
import java.util.*;

public class UncommonWords {

    static String[] uncommonFromSentences(String s1, String s2) {
        Set<String> set = new HashSet<>();
        Set<String> dupset = new HashSet<>();

        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        for (String word : words1) {
            if (!dupset.contains(word)) {
                if (set.contains(word)) {
                    set.remove(word);
                    dupset.add(word);
                } else {
                    set.add(word);
                }
            }
        }
        for (String word : words2) {
            if (!dupset.contains(word)) {
                if (set.contains(word)) {
                    set.remove(word);
                    dupset.add(word);
                } else {
                    set.add(word);
                }
            }
        }
        List<String> sad = new ArrayList<>(set);
        String[] uncommonWordsArray = sad.toArray(new String[0]);
        return uncommonWordsArray;
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        uncommonFromSentences(s1, s2);
    }
}
