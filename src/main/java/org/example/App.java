package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to Georgi's calculator");

        boolean calculator = true;

        while (calculator){
            System.out.println("Do you want to calculate?");
            System.out.println("Choose Y or N");
            String userinput = Scannerstring.getString();

            switch (userinput.toUpperCase())
            {
                case "Y":
                    Calculate.calculator();
                    break;

                case "N":
                    calculator = false;
                    System.out.println("Thank you for using my calculator");
                    break;

                default:
                    System.out.println("Unknown input, please choose Y or N");
                    break;
            }
        }
    }

}
