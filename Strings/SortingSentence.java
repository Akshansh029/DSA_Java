
// For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3". Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
public class SortingSentence {

    public static String sortSentence(String s) {
        String[] splited = s.split(" ");
        String[] ansArray = new String[splited.length];

        for (int i = 0; i < splited.length; i++) {
            char n = splited[i].charAt(splited[i].length() - 1);
            int num = Character.getNumericValue(n);
            String value = splited[i].substring(0, splited[i].length() - 1);
            ansArray[num - 1] = value;
        }

        StringBuilder ans = new StringBuilder();

        for (int j = 0; j < ansArray.length; j++) {
            ans.append(ansArray[j]).append(" ");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
