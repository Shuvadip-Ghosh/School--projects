// Class name: Telephone_Bill
// Data members/Instance variables: String name(name of the consumer);
// int bno (bill number), calls (no. of calls in a month); double billamt (bill amount to be paid)
// Member methods:
// Telephone_Bill(): A default constructor to initialize the data members with default values.
// Telephone_Bill(): A parameterised constructor to accept the name, bill number and calls .
// void calculate(): To calculate the telephone bill as per the tariff given:

// Number of calls
// Rate 
// First 120 calls
// Rs.100
// Next 100 calls
// Rs.0.95/call
// Next 100 calls
// Rs. 1.05/call
// Above 320 calls
// Rs. 1.25/call

// Fixed monthly rental applicable to all consumers is Rs.195
// void display(): To display the name of the consumer, bill number, no. of calls made and the bill amount to be paid in the following format:

// Bill No.		Name       	    No. of calls		Bill Amount
// XXX			XXXX		    XXX			        XXXX.XX

// Write a main method to create an object and invoke the methods to obtain the desired output.

public class Telephone_Bill {
    String name;
    int bno, calls ; 
    double billamt;
    Telephone_Bill(){
        name = "";
        billamt = 0.0d;
        bno = 0;
        calls= 0;
    }
    Telephone_Bill(int bi, int cl, String nm){
        name = nm;
        bno = bi;
        calls = cl;
    }
    void calculate(){
        billamt = 195.0;
        for (int i = 1 ; i<= calls;i++){
            if(i==120){
                billamt =billamt+100.0;
            }
            else if(i>=121&&i<=220){
                billamt = billamt+0.95;
            }
            else if(i>=221&&i<=320){
                billamt = billamt+1.05;
            }
            else if(i>=321){
                billamt = billamt+1.25;
            }
        }
    }
    void display(){
        System.out.printf("%-5s%-50s%-15s%-5s","Bill No.","Name","No. of calls","Bill Amount(in Rupees)");
        System.out.println();
        System.out.format("%-5d%-53s%-15d%-5.2f",bno, name, calls,billamt);
        System.out.println();
    }
    public static void main(String[] args) {
        Telephone_Bill ob = new Telephone_Bill();
        Telephone_Bill ob1 = new Telephone_Bill(256,10000,"Shuvadip Ghosh");
        ob1.calculate();
        ob1.display();
    }
}
