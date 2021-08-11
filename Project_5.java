// Write a Java program to display all the Perfect numbers from 1 to 500 along with their factors using a method fnPerfect(int n), which returns 1 if n is a perfect number else it returns 0.
// Example of the required output:
// 6 - 1  2  3
// 28 - 1  2  4  7  14


public class Project_5 {
    int fnPerfect(int n){
        long sum=0;  
        //executes until the condition becomes false  
        for(int i=1; i <= n/2; i++)  
        {  
            if(n % i == 0)  
            {  
            //calculates the sum of factors  
                sum=sum + i;  
            } //end of if  
        }  //end of for  
        if (sum == n)
            return 1;
        else
            return 0 ;
    }
    public static void main(String[] args) {
        Project_5 ob = new Project_5();
        for(int i = 1; i<501;i++){
            int f = ob.fnPerfect(i);
            if(f== 1){
                System.out.print(i+" - ");
                for (int j = 1; j <i/2; j++){
                    if(i % j == 0){  
                        System.out.print(j+" ");
                    } 
                }
                System.out.println();
            }
        }
    }
    
}