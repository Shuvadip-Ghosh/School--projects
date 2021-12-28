// Wap to input elements in an array and print the Union and intersection of the two array using the methods 
// void printUnion(int arr1[], int arr2[], int m, int n) 
// and 
// void printIntersection(int arr1[], int arr2[], int m, int n)
import java.util.Arrays;
import java.util.Scanner;
public class Project_4 {
    void printUnion(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
    }

    void printIntersection(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Project_4 obj = new Project_4();
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        System.out.println("Enter elements in the first Array: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements in the Second Array: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("The Union of the two array is");
        obj.printUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println("\nThe Intersection of the two array is");
        obj.printIntersection(arr1, arr2, arr1.length, arr2.length);
        
    }
}
