// Take the size of an integer array from the user and input the elements in the array and print the sum of Prime and composite Number Separetly using a method int prime(int n)
import java.util.Scanner;
public class Project_1 {
    int prime(int n)
    {
        int i, c=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
                return 1;
        else
                return 0;
    }
    public static void main(String[] args) {
        Project_1 obj = new Project_1();
        int n,prime=0,composite=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The size of an array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            int t = obj.prime(arr[i]);
            if(t==1){
                prime = prime+arr[i];
            }
            else{
                composite = composite+arr[i];
            }
        }
        System.out.println("The sum of prime numbers is: "+prime+"\nThe sum of Composite Numbers are: "+composite);
    }
}
