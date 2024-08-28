//import stuff here
import java.util.Scanner;
//Your code here
class Program7{
    public static void main (String[] args){
        //make scanner
        Scanner myScanner = new Scanner(System.in);
        //Create Variables
        double schruteBucks=0.0;
        double kelvins=0.0;
        double stanleyNickels=0.0;
        double decimalSB= 0.0;
        //Ask for input and store
        System.out.println("Enter schrute-bucks: ");
        schruteBucks= myScanner.nextDouble();
        System.out.println("Enter kelvins: ");
        kelvins= myScanner.nextDouble();
        System.out.println("Enter stanley-nickels: ");
        stanleyNickels= myScanner.nextDouble();
        //Do Calculations
        kelvins= kelvins/20.0;
        stanleyNickels= stanleyNickels/240;
        decimalSB=(schruteBucks+kelvins+stanleyNickels)+0.005;
        //Round
        decimalSB= (int)(decimalSB*100);
        decimalSB= (double)(decimalSB/100);
        //Create Output
        System.out.print("Decimal schrute-bucks:"+ decimalSB);
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter kelvins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks:7.89
*/
