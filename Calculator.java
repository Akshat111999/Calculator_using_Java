import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    	double FirstNumber, SecondNumber;            //Number which will hold the value entered by the user for the operation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* Data type double is used so that user
           can enter integer as well as floating point
           value
         */
        FirstNumber = scanner.nextDouble();        // User input for 1st operand
        System.out.print("Enter second number:");
        SecondNumber = scanner.nextDouble();       // User input for 2nd operand

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);           // User input for operator

        scanner.close();
        double output;

        switch(operator) // Switch case will decide which operation will 
                         // be performed according to the user input of operator.
        {
            case '+':
            	output = FirstNumber + SecondNumber;
                break;

            case '-':
            	output = FirstNumber - SecondNumber;
                break;

            case '*':
            	output = FirstNumber * SecondNumber;

            case '/':
            	output = FirstNumber / SecondNumber;
                break;

            /* If user inputs any other type of operator or any another character apart from
             * +, -, * and /, then user will get an error message
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(FirstNumber+" "+operator+" "+SecondNumber+": "+output);
    }
}
