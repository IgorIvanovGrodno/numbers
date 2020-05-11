package numbers;

import numbers.exceptions.NoElements;

import java.util.Scanner;

public class ConsoleNumber {
    private  static Numbers numbers =new Numbers();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterData;
        while(true){
            System.out.println("Please, enter integer number (or E for exit, min for view minimal number, max for view maximal number, avr for view average of all numbers):");
            enterData=scanner.nextLine();

            if(enterData==null)continue;
            if(enterData.equalsIgnoreCase("e")){break;}

            try {
                command(enterData);
            } catch (NoElements noElements) {
                System.out.println("Sorry, no entered numbers");
            }
        }
    }

    public static void command(String enterData) throws NoElements {
        if(enterData.equalsIgnoreCase("max")) System.out.println(numbers.getMaxOfNumbers());
            else if(enterData.equalsIgnoreCase("min")) System.out.println(numbers.getMinOfNumbers());
                else if(enterData.equalsIgnoreCase("avr")) System.out.println(numbers.getAverageOfAllNumbers());
                    else {
                            try {
                                numbers.addNumber(Integer.parseInt(enterData));
                            }catch (NumberFormatException e){
                                System.out.println("Incorrect number");
                            }
                    }

    }


}
