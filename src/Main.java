import java.util.Scanner;
import java.lang.Math;
// importing packages required for math and inputs

public class Main {
    static int addition(int num1, int num2){
        return num1 + num2;
    }
    static int subtraction(int num1,int num2){
        return num1 - num2;
    }
    static int division(int num1, int num2){
        return num1/num2;
    }
    static int multiplication(int num1, int num2){
        return num1*num2;
    }
    static int power(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }
    static int remainder(int num1, int num2){
        return (int) Math.IEEEremainder(num1,num2);
    }
    static int nextup(int num1, int num2){
        return (int) Math.nextAfter(num1,num2);
        //returns floating point number adjacent to num1 in direction of num2
    }
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        // declaring a scanner object
        System.out.println("Enter your first number:");
        int num1 = scannerobj.nextInt();
        // assigning the user input to number 1
        System.out.println("Enter your second number:");
        int num2 = scannerobj.nextInt();
        // assigning the user input to number 2
        scannerobj.nextLine();
        //stops an empty line from being read and a crash occurring
        System.out.println("Which Operation would you like?");
        String selection = scannerobj.nextLine();
        // assigning the user operation choice to the selection variable
        switch (selection){
            case "Addition":
                System.out.println(num1 + "+" + num2 + "=" + addition(num1, num2));
                // calls the addition method
                break;
            case "Subtraction":
                System.out.println(num1 + "-" + num2 + "=" + subtraction(num1,num2));
                // calls the subtraction method
                break;
            case "Division":
                System.out.println(num1 + "/" + num2 + "=" + division(num1,num2));
                // calls the division method
                break;
            case "Multiplication":
                System.out.println(num1 + "*" + num2 + "=" + multiplication(num1,num2));
                // calls the multiplication method
                break;
            case "Power":
                System.out.println(num1 + " to the power of " + num2 + " is " + power(num1,num2));
                // calls the power method
                break;
            case "Remainder":
                System.out.println("The remainder of " + num1 + " and "  + num2 + " is " + remainder(num1,num2));
                // calls the remainder method
                break;
            case "NextUp":
                System.out.println("the result of nextup is " + nextup(num1,num2));
                break;
            default:
                System.out.println("an unexpected error occurred");
                // default case
                break;
        }
    }
}