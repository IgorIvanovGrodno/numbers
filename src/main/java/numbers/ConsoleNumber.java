package numbers;

import numbers.exceptions.NoElementsException;

import java.util.Scanner;

import static numbers.Numbers.*;

/**
 * Class ConsoleNumber is responsible for interaction with user. It receive data and handles it.
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
        String enterData;
        while (true)
        {
            System.out.println("Please, enter integer number (or E for exit, min for view minimal number, max for view maximal number, avr for view average of all numbers):");
            enterData = scanner.nextLine();

            if (enterData == null)
            {
                continue;
            }
            if (enterData.equalsIgnoreCase("e"))
            {
                break;
            }
            try
            {
                command(enterData);
            }
            catch (NoElementsException noElementsException)
            {
                System.out.println("Sorry, no entered numbers");
            }
        }
    }

    /**
     * This method receives user input data (String) and handles them:
     * if input data equals "max"/"min"/"avr" - calls appropriate static methods of {@link Numbers} class;
     * if input data equals integer number - parses it and transmits to {@link Numbers#addNumber(int)}.
     *
     * @param enterData Entered data by user.
     * @throws NoElementsException On call methods of {@link Numbers} class  when no entered numbers.
     */
    private static void command(String enterData) throws NoElementsException
    {
        if (enterData.equalsIgnoreCase("max"))
        {
            System.out.println(getMaxOfNumbers());
        }
        else if (enterData.equalsIgnoreCase("min"))
        {
            System.out.println(getMinOfNumbers());
        }
        else if (enterData.equalsIgnoreCase("avr"))
        {
            System.out.println(getAverageOfAllNumbers());
        }
        else
        {
            try
            {
                addNumber(Integer.parseInt(enterData));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Incorrect number");
            }
        }

    }
}
