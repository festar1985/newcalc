package org.example;

public class Calculate
{
    public static double calculator()
    {
        System.out.println("Choose Number 1:");
        double number1 = Scannerint.getNumber();

        System.out.println("Choose function +,-,*,/ :");
        String function = Scannerstring.getString();

        System.out.println("Choose Number 2:");
        double number2 = Scannerint.getNumber();

        double result = 0;

        switch (function)
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
        return result;
    }


}
