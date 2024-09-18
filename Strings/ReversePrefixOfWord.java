
public class ReversePrefixOfWord {

    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[] arr = word.toCharArray();

        int start = 0;

        while (start <= index) {
            char temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;

            start++;
            index--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

}
