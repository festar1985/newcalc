package org.example;

import java.util.Scanner;

public class Scannerstring
{

    public static Scanner scann = new Scanner(System.in);

    public static String getString()
    {
        return scann.nextLine().trim();
    }

}




