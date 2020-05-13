package numbers;

import numbers.exceptions.NoElementsException;

/**
 * Class Numbers store maximum, minimum and average value of user input numbers.
 *
 * @author Igor Ivanov
 * @since 13.05.2020
 */
public class Numbers
{
    /**
     * Field maximum value of entered numbers.
     */
    private static int maxOfNumbers;
    /**
     * Field minimum value of entered numbers.
     */
    private static int minOfNumbers;
    /**
     * Sum of all entered numbers.
     */
    private static int sumOfNumbers;
    /**
     * Count of all entered numbers.
     */
    private static int countOfNumbers;

    /**
     * This method return average value of all user input numbers.
     *
     * @return Return average value of all user input numbers.
     * @throws NoElementsException On call method when no entered numbers.
     */
    public static double getAverageOfAllNumbers() throws NoElementsException
    {
        if (countOfNumbers == 0)
        {
            throw new NoElementsException();
        }
        return 1.0 * sumOfNumbers / countOfNumbers;
    }

    /**
     * This method receives number and update maxOfNumbers/minOfNumbers field if input number more/less than
     * value of the field. Increments count of user input numbers and adds to sum of all entered numbers.
     *
     * @param number Input number
     */
    public static void addNumber(int number)
    {
        sumOfNumbers += number;
        if (countOfNumbers > 0)
        {
            if (number > maxOfNumbers)
            {
                maxOfNumbers = number;
            }
            else if (number < minOfNumbers)
            {
                minOfNumbers = number;
            }
        }
        else
        {
            minOfNumbers = number;
            maxOfNumbers = number;
        }
        countOfNumbers++;
    }

    /**
     * This method return maximum value of entered numbers.
     *
     * @return Maximum value of entered numbers.
     * @throws NoElementsException On call method when no entered numbers.
     */
    public static int getMaxOfNumbers() throws NoElementsException
    {
        if (countOfNumbers == 0)
        {
            throw new NoElementsException();
        }
        return maxOfNumbers;
    }

    /**
     * This method return minimum value of entered numbers.
     *
     * @return Minimum value of entered numbers.
     * @throws NoElementsException On call method when no entered numbers.
     */
    public static int getMinOfNumbers() throws NoElementsException
    {
        if (countOfNumbers == 0)
        {
            throw new NoElementsException();
        }
        return minOfNumbers;
    }
}
