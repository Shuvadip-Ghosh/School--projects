/**
 * wap to input a String and store each letter in an array separetly and determine that which letter is a vowel and which is s consonant.
 */
import java.util.Scanner;
public class Project_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a Sentence: ");
        s=sc.nextLine();
        s = s.trim();
        String arr[] = s.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                char ch = arr[i].charAt(j);
                if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='0')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                    System.out.println(ch + " - vowel");
                else
                    System.out.println(ch +" - consonant");
            }
        }
    }   
}