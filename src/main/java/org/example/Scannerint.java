package org.example;

import java.util.Scanner;

public class Scannerint
{

    public static Scanner scann = new Scanner(System.in);

    public static double getNumber()
    {
        String tempnumber = scann.nextLine();

        boolean invalidDouble = true;
        double number = 0;
        while(invalidDouble){
            try{
                number = Double.parseDouble(tempnumber.replace(',','.'));
                invalidDouble = false;
            }catch (NumberFormatException ex){
                System.out.println("Not a valid double");
            }
        }

        return number ;
    }
}
