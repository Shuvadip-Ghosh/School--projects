// wap to input 12 integer elements in an array Input a number in 'n' and check if 'n' is present in the array or not . If present then check 
// the number is Xylem or Phloem number or not.
import java.util.Scanner;
import java.util.Arrays;
public class Project_5 {
    void Xylem_Phloem(int num) {
        int extreme_sum = 0, mean_sum = 0, n;
        num = Math.abs(num);
        n = num;
        while (n != 0) {
            if (n == num || n < 10)
                extreme_sum = extreme_sum + n % 10;
            else
                mean_sum = mean_sum + n % 10;
            n = n / 10;
        }
        if (extreme_sum == mean_sum)
            System.out.println(num + " is present in the array and is a xylem number.");
        else
            System.out.println(num + " is present in the array and is a phloem number.");
    }

    public static void main(String[] args) {
        Project_5 obj = new Project_5();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[12];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int n = sc.nextInt();
        int ll = 0, ul=arr.length-1,mid,c=0;
        Arrays.sort(arr);
        while (ul>=ll){
            mid =(ul+ll)/2;
            if(arr[mid]>n)
                ul = mid -1;
            if (arr[mid]<n)
                ll = mid+1;
            if (arr[mid]==n){
                c++;
                break;
            }
        }
        if (c>0)
            obj.Xylem_Phloem(n);
        else
            System.out.println("The entered number is not in the array.");
    }
}
