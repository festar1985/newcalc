package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to Georgi's calculator");

        boolean calculator = true;

        while (calculator)  // Creating a loop in order the calculator to run until the user stops it
        {
            System.out.println("Do you want to calculate?");
            System.out.println("Choose Y or N");
            String userinput = Scannerstring.getString();

            switch (userinput.toUpperCase())
            {
                case "Y":
                    UserInput.Input(); // If Y is typed the program goes to UserInput
                    break;

                case "N":
                    calculator = false; // If N the program exits
                    System.out.println("Thank you for using my calculator");
                    break;

                default: // Catch all other inputs
                    System.out.println("Unknown input, please choose Y or N");
                    break;
            }
        }
    }

}
