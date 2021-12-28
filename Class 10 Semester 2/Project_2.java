//Wap to input 10 integer elements in an array and Count the number of Even and odd numbers and then display the sum of Even and product of all the odd numbers.
import java.util.Scanner;
public class Project_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,product=1,eve=0,odd=0;
        int arr[] = new int[10];
        System.out.println("Enter the 10 integer elements in the array: ");
        for(int i = 0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if (arr[i]%2==0){
                sum = sum+arr[i];
                eve +=1;
            }
            else{
                odd+=1;
                product = product*arr[i];
            }
        }
        System.out.println("There are "+eve+" even numbers and their sum is: "+sum);
        System.out.println("There are "+odd+" odd numbers and their product is: "+product);
    }
}
