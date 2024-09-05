// package JavaBasics;

import java.util.Scanner;
//Write a program to return a string from a given string s where all occurrences of the first char of the string except the first occurrence have been changed to '$'.

public class replaceChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        char firstChar = s.charAt(0);
        String newString = "" + firstChar;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                newString += '$';
            } else {
                newString += s.charAt(i);
            }
        }
        System.out.println(newString);
        sc.close();
    }
}
