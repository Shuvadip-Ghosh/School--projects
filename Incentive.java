// A LIC agent offers a discount to his policy holders on the annual premium. He also gets a commission on the sum assured.
// Class name: Incentive
// Data Members/instance variables: String name(Name of the investor/policy holder); double sum (sum assured),  pre(annual premium), comm(commission)
// Member Methods:
// void input: Inputs the name, the sum assured and the first annual premium
// void compute(): calculates the discount on the annual premium and the commission on the sum assured as per the given tariff:

// Sum Assured
// Discount
// Commission
// Upto Rs. 100000
// 10%
// 3%
// 100001 - 200000
// 15%
// 5%
// 200001 - 500000
// 18%
// 8%
// Above 500000
// 20%
// 12%

// void display(): Displays the name of the policy holder, sum assured and 
// the discount amount received. Also displays the commission.
// Write a main method to create an object and call the above methods.
import java.util.Scanner;
public class Incentive {
    String name;
    double sum ,pre, comm,discount_amt;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the investor/policy holder : ");
        name = sc.nextLine();
        System.out.println("Enter first annual premium: ");
        pre = sc.nextDouble();
        System.out.println("Enter sum assured : ");
        sum = sc.nextDouble();
    }
    void compute(){
        if (sum<=100000){
            discount_amt = pre - (pre*0.1);
            comm = sum*0.03;
        }
        else if (sum>=100001 && sum <=200000){
            discount_amt = pre - (pre*0.15);
            comm = sum*0.05;
        }
        else if (sum>=200001 && sum <=500000){
            discount_amt = pre - (pre*0.18);
            comm = sum*0.08;
        }
        else if(sum>500000) {
            discount_amt = pre - (pre*0.2);
            comm = sum*0.12;
        }
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Sum assured : "+sum);
        System.out.println("Discount amount received : "+discount_amt);
        System.out.println("Commission: "+discount_amt);
    }
    public static void main(String[] args) {
        Incentive ob = new Incentive();
        ob.input();
        ob.compute();
        ob.display();
    }
}
