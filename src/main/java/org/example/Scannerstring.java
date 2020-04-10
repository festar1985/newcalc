package org.example;

import java.util.Scanner;

public class Scannerstring
{

    Scanner scann = new Scanner(System.in);

    public String getString()
    {
        return scann.nextLine().trim();
    }

}




