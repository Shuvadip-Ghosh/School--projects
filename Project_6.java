// Write a Java program to overload a function calculate() as follows:

// calculate(int, int, char): returns the sum of the squares of the two int type values if their product is greater than the ascii value of the char type, else returns the sum of the cube of the two int type values.

// calculate(int, char, char): if the int type value is greater than the sum of the ascii values of the two character arguments, then return the sum of all the three arguments, otherwise return their product.

// Write a main method to create an object and call the above methods.

public class Project_6 {
    int calculate(int n1, int n2, char c){    
        int ascii = (int) c;
        // System.out.println(ascii);
        if (n1*n2>ascii)
            return (n1*n1)+(n2*n2);
        else 
            return (n1*n1*n1)+(n2*n2*n2);
    }
    int calculate(int n1, char d, char c){
        int ascii = (int) c;
        int ascii_d = (int) d;
        if (n1>ascii+ascii_d)
            return n1+ascii+ascii_d;
        else 
            return n1*ascii*ascii_d;
    }
    public static void main(String[] args) {
        Project_6 ob = new Project_6();
        int m_1 = ob.calculate(96, 'm', 'j');
        System.out.println(m_1);
        int m_2 = ob.calculate(95, 56, 'd');
        System.out.println(m_2);
    }
}
