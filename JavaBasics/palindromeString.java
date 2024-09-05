// package JavaBasics;

public class palindromeString {

    public static void main(String[] args) {
        String str = "malayalam";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        if (str.toLowerCase().equals(reversedStr.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
