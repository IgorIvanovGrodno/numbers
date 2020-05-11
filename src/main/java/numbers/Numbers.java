package numbers;

import numbers.exceptions.NoElements;

public class Numbers {
    private int maxOfNumbers;
    private int minOfNumbers;
    private int sumOfNumbers;
    private int countOfNumbers;

    public double getAverageOfAllNumbers() throws NoElements {
        if(countOfNumbers==0) throw new NoElements();
        return 1.0*sumOfNumbers/countOfNumbers;
    }

    public void addNumber(int number){
        sumOfNumbers+=number;
        if(countOfNumbers>0) {
            if (number > maxOfNumbers) maxOfNumbers = number;
                else if (number < minOfNumbers) minOfNumbers = number;
        }else{
            minOfNumbers=number;
            maxOfNumbers=number;
        }
        countOfNumbers++;
    }

    public int getMaxOfNumbers() throws NoElements {
        if(countOfNumbers==0) throw new NoElements();
        return maxOfNumbers;
    }

    public int getMinOfNumbers() throws NoElements {
        if(countOfNumbers==0) throw new NoElements();
        return minOfNumbers;
    }
}
