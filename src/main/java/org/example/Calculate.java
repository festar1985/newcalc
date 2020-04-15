package org.example;

public class Calculate
{
    public static double calculator(double number1, String function, double number2)
    {

        double result = 0;

        switch (function)
        {
            case "+":
                result = number1 + number2;
                System.out.println("The result is: " + number1 + " + " + number2 + " = " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("The result is: " + number1 + " - " + number2 + " = " + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("The result is: " + number1 + " * " + number2 + " = " + result);
                break;

            case "/":
                result = number1 / number2;
                System.out.println("The result is: " + number1 + " / " + number2 + " = " + result);
                break;

            // catching the case where the user type a function that is not one of the four defined.
            default:
                System.out.println("Not a valid function sign: " + function + "\nPlease use +, -, *, /");
                break;
        }

        return result;
    }


}
