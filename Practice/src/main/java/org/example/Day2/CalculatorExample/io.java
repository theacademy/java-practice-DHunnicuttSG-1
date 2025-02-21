package org.example.Day2.CalculatorExample;

import java.util.Scanner;

public class io {

    final private Scanner sc = new Scanner(System.in);

    public int DisplayMenu(){
        int option;

        DisplayMessage("");
        DisplayMessage("");
        DisplayMessage("1. Add");
        DisplayMessage("2. Subtract");
        DisplayMessage("3. Multiply");
        DisplayMessage("4. Divide");
        DisplayMessage("5. Exit");
        DisplayMessage("");
        DisplayMessage("Choice: ");
        DisplayMessage("");
        // i'm breaking this
        option = readInt();
        return option;
    }

    public int readInt() {
        boolean invalidInput = true;
        int num = 0;
        while (invalidInput) {
            try {
                String stringValue = sc.nextLine();
                num = Integer.parseInt(stringValue); // if it's 'bob' it'll break
                invalidInput = false; // or you can use 'break;'
            } catch (NumberFormatException e) {
                // If it explodes, it'll go here and do this.
                //System.out.println("Input error. Please try again.");
                break;
            }
        }
        return num;
    }

    public void DisplayMessage(String Msg){
        System.out.println(Msg);
    }

    public String readString(){
        return sc.nextLine();
    }

    public float GetOperand1(){
        Scanner sc = new Scanner(System.in);
        DisplayMessage("What is the first operand: ");

        while (true) {
            try {
                return  Float.parseFloat(this.readString());
            } catch (NumberFormatException e) {
                System.out.println("Input error. Please try again.");
            }
        }

    }

    public float GetOperand2(){
        Scanner sc = new Scanner(System.in);
        DisplayMessage("What is the second operand: ");

        while (true) {
            try {
                //input is always a string from the console
                return  Float.parseFloat(this.readString());
            } catch (NumberFormatException e) {
                System.out.println("Input error. Please try again.");
            }
        }

    }
}
