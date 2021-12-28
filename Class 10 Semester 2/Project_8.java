/**
 * Wap to input two strings and check if they are anagram (Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.). 
 * Example Brag and Grab
 */
import java.util.Arrays;
import java.util.Scanner;
public class Project_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        } 
        else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if (Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            } 
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}