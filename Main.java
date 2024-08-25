import java.util.Scanner;

//ChatGPT used as reference
public class Main {
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!");
        System.out.println("What is your name?");

    
        String name = GetInput();
        CheckInput(name);

        NameTag nameTag = new NameTag(name);
        NameTag otherName = new NameTag("CS112");
        NameTag thirdName = new NameTag(nameTag);

        //toString not needed since it is something Java already looks for
        System.out.println("Nice to meet you, "+ nameTag.toString());


        if (nameTag.equals(thirdName))
        {
            System.out.println("The name has been duplicated!");
        }
        else 
        {
            System.out.println("Those. aren't the same names.");
        }
    }
    
    //Read user input from the terminal
    public static String GetInput()
    {
        //Asked ChatGPT how to grab user input from terminal
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        return inputString;
    }

    //Verify we have actual input
    public static void CheckInput(String inputString)
    {

        if (inputString == null)
        {
            inputString = "Invalid";
        }

    }
}