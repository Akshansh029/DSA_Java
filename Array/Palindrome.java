package Array;

public class Palindrome {
    public static boolean palindrome(String word){
        char[] charArr = word.toLowerCase().toCharArray();
        int start = 0;
        int end = charArr.length-1;
        while (start<end) {
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        String name = "Madam";
        System.out.println(Palindrome.palindrome(name));;
    }
}
