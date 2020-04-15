package org.example;

public class Calculate
{
    public static double calculator(double number1, String function, double number2)
    {

        double result = 0; //define a variable to use it later

        // calculating the 4 cases

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

                if (number2 == 0 )
                {
                    System.out.println("You can not divide on 0"); // do not allow to divide on 0
                    break;
                }
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
