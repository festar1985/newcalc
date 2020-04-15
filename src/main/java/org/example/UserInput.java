package org.example;

public class UserInput
{
    public static double Input()
    {
        System.out.println("Choose Number 1:");
        double number1 = Scannerint.getNumber();

        System.out.println("Choose function +,-,*,/ :");
        String function = Scannerstring.getString();

        System.out.println("Choose Number 2:");
        double number2 = Scannerint.getNumber();

        return Calculate.calculator(number1,function,number2);
    }

}
