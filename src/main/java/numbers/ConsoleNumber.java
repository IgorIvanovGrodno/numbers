package numbers;

import numbers.exceptions.NoElementsException;

import java.util.Scanner;

import static numbers.Numbers.*;

/**
 * Class ConsoleNumber is responsible for interaction with user. It receives and executes commands.
 *
 * @author Igor Ivanov
 * @since 13.05.2020
 */

public class ConsoleNumber
{
    /**
     * This method run application. It is responsible for interaction with user - show messages, receives data and return results.
     *
     * @param args Input arguments.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String enterCommand;
        while (true)
        {
            System.out.println("Please, enter integer number (or E for exit, min for view minimal number, max for view maximal number, avr for view average of all numbers):");
            enterCommand = scanner.nextLine();

            if (enterCommand == null)
            {
                continue;
            }
            if (enterCommand.equalsIgnoreCase("e"))
            {
                break;
            }
            try
            {
                executeCommand(enterCommand);
            }
            catch (NoElementsException noElementsException)
            {
                System.out.println("Sorry, no entered numbers");
            }
        }
    }

    /**
     * This method receives user input command (String) and execute it:
     * if input command equals "max"/"min"/"avr" - calls appropriate static methods of {@link Numbers} class;
     * if input command equals integer number - parses it and transmits to {@link Numbers#addNumber(int)}.
     *
     * @param enterCommand Entered data by user.
     * @throws NoElementsException On call methods of {@link Numbers} class  when no entered numbers.
     */
    private static void executeCommand(String enterCommand) throws NoElementsException
    {
        if (enterCommand.equalsIgnoreCase("max"))
        {
            System.out.println(getMaxOfNumbers());
        }
        else if (enterCommand.equalsIgnoreCase("min"))
        {
            System.out.println(getMinOfNumbers());
        }
        else if (enterCommand.equalsIgnoreCase("avr"))
        {
            System.out.println(getAverageOfAllNumbers());
        }
        else
        {
            try
            {
                addNumber(Integer.parseInt(enterCommand));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Incorrect number");
            }
        }

    }
}
