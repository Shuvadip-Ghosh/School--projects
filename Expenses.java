// A man spends 45% of his monthly salary on food(sFood), 10% on daily transportation(sTra), 8% on clothes(sStyle), 5% on outings(sOut), 2% on charity(sChr), 10% on investments(sInv) and the rest he saves(Save). He spends 10% on holiday trips(sTrip) annually.
// Class name: Expenses
// Data Members/Instance variables: double Msal(monthly salary), sFood, sTra, sStyle, sOut, sChr, sInv, Save, sTrip, aExp(annual expense)
// Member methods:
// Expenses(): A default constructor to initialize the data members.
// void input(): Inputs the monthly salary
// void expenditure(): calculates the annual expenses and annual savings
// void display(): displays the amount spent annually on food, clothing, transportation,  outings, charity, investments, annual holiday trip, annual expense and annual savings.
// Write a main method to create a class and call the above methods.
import java.util.Scanner;
public class Expenses {
    double Msal, sFood, sTra, sStyle, sOut, sChr, sInv, Save, sTrip, aExp,Asal;
    Expenses(){
        Msal = 0.0d;
        sFood = 0.0d;
        sTra =0.0d;
        sStyle = 0.0d;
        sOut = 0.0d;
        sChr = 0.0d;
        sInv = 0.0d;
        Save = 0.0d;
        sTrip = 0.0d;
        aExp = 0.0d;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monthly salary: ");
        Msal = sc.nextDouble();
    }
    void expenditure(){
        Asal = Msal*12;
        sFood = Asal*0.45;
        sTra = (Asal-sFood)*0.10;
        sStyle = Asal*0.08;
        sOut = Asal*0.05;
        sChr = Asal*0.02;
        sInv = Asal*0.10;
        Save = Asal-sFood-sChr-sInv-sOut-sStyle-sTra-sTrip;
    }
    void display(){
        System.out.println(Save);
        System.out.println(Asal-Save);
    }
    public static void main(String[] args) {
        Expenses ob = new Expenses();
        ob.input();
        ob.expenditure();
        ob.display();
    }
}
