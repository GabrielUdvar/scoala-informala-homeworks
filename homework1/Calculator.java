import java.util.Scanner;
import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args) {
        // initialisation of variables used in the calculator
        double num1, num2;
        short repeat = 1;
        double result;
        // Character "C" is used to determine the type of operation to be executed
        char C;
        Scanner number = new Scanner(in);
        while(repeat == 1){
        System.out.println("Type in the first number:");
        num1 = number.nextDouble(); //giving the variable num1 the read number
        System.out.println("Type in the second number:");
        num2 = number.nextDouble(); //giving the variable num2 the read number
        System.out.println("Your numbers are: "+num1+" and "+num2+"");
        System.out.println ("What would you like to do with them? Type in the operator:");
Scanner s = new Scanner(System.in);
        C = s.next().charAt(0); // give variable C the read operator;
        switch (C){ // verify the character
            case '/' :
                if (num2==0) {
                System.out.println("Watch out!!! Division to zero makes no sense");}
                else {
                    result = num1/num2;
                    System.out.println("Division result is:" +result);}
                break;
            case '*':
                result = num1*num2;
                System.out.println("Multiplication result is:" +result);
                break;
            case '+':
                result = num1+num2;
                System.out.println("Addition result is:" +result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Substraction result is:" +result);
                break;
            default:
                System.out.println("Invalid operator");
    }
            System.out.println("Want to do iy again? Type 1 for YES and 0 for NO");
            repeat = number.nextShort();
}}}
