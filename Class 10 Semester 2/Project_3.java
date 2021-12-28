//Wap to input 10 integer elements in an array and Cyclically rotate the array by 1
import java.util.Scanner;

public class Project_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
        System.out.println("The array after rotating is: ");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
