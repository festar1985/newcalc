package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest
{


    @Test // testing addition of 2 float numbers
    public void addition1()
    {
       double expectedresult = 35.5;
       double number1 = 22.2;
       double number2 = 13.3;
       String function = "+";

       double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test // testing addition when we have a negative number
    public void addition2()
    {
        double expectedresult = 8.7;
        double number1 = 22;
        double number2 = -13.3;
        String function = "+";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test // testing a substraction of 2 numbers one is float number
    public void substraction1()
    {
        double expectedresult = 11.2 ;
        double number1 = 15.2;
        double number2 = 4;
        String function = "-";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test // testing a substraction when one of the numbers is negative
    public void substraction2()
    {
        double expectedresult = 65;
        double number1 = 52;
        double number2 = -13;
        String function = "-";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test // testing multiplication
    public void multiplication1()
    {
        double expectedresult = 42.64 ;
        double number1 = 5.2;
        double number2 = 8.2;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test // testing a multiplication with a negative number
    public void multiplication2()
    {
        double expectedresult = -48;
        double number1 = 12;
        double number2 = -4;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test // testing multiplication with 0
    public void multiplication3()
    {
        double expectedresult = 0;
        double number1 = 12;
        double number2 = 0;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test // testing division of a float number
    public void division1()
    {
        double expectedresult = 10.11 ;
        double number1 = 80.88;
        double number2 = 8;
        String function = "/";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test // test division of a negative number
    public void division2()
    {
        double expectedresult = -9;
        double number1 = 54;
        double number2 = -6;
        String function = "/";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

}
