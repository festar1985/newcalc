package org.example;


public class App 
{
    public static void main( String[] args )
    {

        // using Scanner to input the numbers and the function type
        // I have created 2 scanner classes to reuse the input.

        System.out.println("Choose Number 1:");
        Scannerint num1 = new Scannerint();
        double number1 = num1.getNumber();

        System.out.println("Choose function +,-,*,/ :");
        Scannerstring func = new Scannerstring();
        String function = func.getString();

        System.out.println("Choose Number 2:");
        Scannerint num2 = new Scannerint();
        double number2 = num2.getNumber();

        double result; // creating the variable result to reuse it later

        switch (function) //use the switch in order to decide which function is going to be used.
        {
            case "+":
                result = number1 + number2;
                System.out.println("The result is: " + number1 + "+" + number2 + "=" + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("The result is: " + number1 + "-" + number2 + "=" + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("The result is: " + number1 + "*" + number2 + "=" + result);
                break;

            case "/":
                result = number1 / number2;
                System.out.println("The result is: " + number1 + "/" + number2 + "=" + result);
                break;

            // catching the case where the user type a function that is not one of the four defined.
            default:
                System.out.println("Not a valid function sign: " + function + "\nPlease use +, -, *, /");
                break;
        }
    }

}
