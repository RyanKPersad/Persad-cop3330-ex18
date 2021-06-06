/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package Temp_Conversion;
import java.util.Scanner;


public class App 
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        String choice;
        String temp;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice:");
        choice = myObj.nextLine();
        //Ignores case
        if (choice.equalsIgnoreCase("F")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            temp = myObj.nextLine();
            int newTemp = Integer.parseInt(temp);

            int y = newTemp-32;
            int x = y*5;
            int c = x/9;
            String print1 = String.format("The temperature in Celsius is %d.",c);
            System.out.println(print1);


        }else if(choice.equalsIgnoreCase("C")){
            System.out.println("Please enter the temperature in Celsius:");
            temp = myObj.nextLine();
            int newTemp = Integer.parseInt(temp);

            int x1 = newTemp*9;
            int y1 = x1/5;
            int f = y1 + 32;
            String print2 = String.format("The temperature in Fahrenheit is %d.",f);
            System.out.println(print2);

        }

    }
}
