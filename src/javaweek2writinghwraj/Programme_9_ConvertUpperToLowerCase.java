package javaweek2writinghwraj;

import java.util.Scanner;

/*
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
        obj.convertUpperCaseToLowerCase(uppercase);

        //closing the scanner object
        scanner.close();
    }

    //conversion of Uppercase to Lowercase method
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
