package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest
{


    @Test
    public void addition1()
    {
       double expectedresult = 35;
       double number1 = 22;
       double number2 = 13;
       String function = "+";

       double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test
    public void addition2()
    {
        double expectedresult = 9;
        double number1 = 22;
        double number2 = -13;
        String function = "+";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test
    public void substraction1()
    {
        double expectedresult = 11 ;
        double number1 = 15;
        double number2 = 4;
        String function = "-";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test
    public void substraction2()
    {
        double expectedresult = 65;
        double number1 = 52;
        double number2 = -13;
        String function = "-";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test
    public void multiplication1()
    {
        double expectedresult = 40 ;
        double number1 = 5;
        double number2 = 8;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test
    public void multiplication2()
    {
        double expectedresult = -48;
        double number1 = 12;
        double number2 = -4;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test
    public void multiplication3()
    {
        double expectedresult = 0;
        double number1 = 12;
        double number2 = 0;
        String function = "*";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult, result, 0);
    }

    @Test
    public void division1()
    {
        double expectedresult = 10 ;
        double number1 = 80;
        double number2 = 8;
        String function = "/";

        double result = Calculate.calculator(number1, function, number2);


        Assert.assertEquals(expectedresult,result, 0);

    }

    @Test
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
