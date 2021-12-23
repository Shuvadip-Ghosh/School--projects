// Write a java program to display the sum of the following series:
//  S = 1/3! + 4/6! + 7/9! + ………+31/33!, using a method fnFact(int n) which returns the factorial of n.

public class Project_7 {

    public static int fnFact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        double sum=0.0;
        for(int i=1;i<=31;i+=3)
        {
            sum=sum+(double)i/fnFact(i+2);
        }
        System.out.println("Sum of the series : "+sum);
        
    }
}
