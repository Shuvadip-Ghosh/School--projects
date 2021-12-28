/** 
 * Wap to Input a Word and print a half diamond Pattern using the word
 */
import java.util.Scanner;

public class Project_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        int size = word.length();
  
        for (int i=0; i < (2*size-1); i++) {
          int column = (i<size) ? i : (2*size-i-2);
          for (int j=0; j<=column; j++) {
            System.out.print(word.charAt(j));
          }
          System.out.println(); // new line
        }
    }
}