package org.example.Day1;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";
        int intInput1 = 0;
        int intInput2 = 0;

        System.out.println("Please enter a number: ");
        input = sc.nextLine();
        intInput1 = Integer.parseInt(input);

        System.out.println("Please enter a number: ");
        input = sc.nextLine();
        intInput2 = Integer.parseInt(input);

        System.out.println("The sum of the two inputs is: " + (intInput1 + intInput2));

    }
}
