package org.example.Day2.CalculatorExample;

public class App {
    public static void main(String[] args) {
        //Calculate calc = new Calculate();
        int choice = 0;
        float oper1 = 0;
        float oper2 = 0;

        Calculate calc = new Calculate();
        io newMenu = new io();
        newMenu.DisplayMessage("Welcome to the Simple Calculator App.");
        newMenu.DisplayMessage("Please choose one: ");
        choice = newMenu.DisplayMenu();

        while (choice <= 5) {
            if (choice == 1) {
                oper1 = newMenu.GetOperand1();
                oper2 = newMenu.GetOperand2();
                float answer = calc.add(oper1, oper2);
                newMenu.DisplayMessage(oper1 + " + " + oper2 + " = " + answer);
                choice = newMenu.DisplayMenu();
            }

            if (choice == 2) {
                oper1 = newMenu.GetOperand1();
                oper2 = newMenu.GetOperand2();
                float answer = calc.subtract(oper1, oper2);
                newMenu.DisplayMessage(oper1 + " - " + oper2 + " = " + answer);
                choice = newMenu.DisplayMenu();
            }

            if (choice == 3) {
                oper1 = newMenu.GetOperand1();
                oper2 = newMenu.GetOperand2();
                float answer = calc.multiply(oper1, oper2);
                newMenu.DisplayMessage(oper1 + " * " + oper2 + " = " + answer);
                choice = newMenu.DisplayMenu();
            }

            if (choice == 4) {
                oper1 = newMenu.GetOperand1();
                oper2 = newMenu.GetOperand2();

                if (oper2 == 0) {
                    newMenu.DisplayMessage("Cannot divide by zero! Start over.");
                    choice = newMenu.DisplayMenu();
                } else {
                    float answer = calc.divide(oper1, oper2);
                    newMenu.DisplayMessage(oper1 + " / " + oper2 + " = " + answer);
                    choice = newMenu.DisplayMenu();
                }
            }

            if (choice == 5) {
                newMenu.DisplayMessage("Thank you for using the simple calculator.");
                return;
            }

            if (choice > 5 || choice < 1) {
                newMenu.DisplayMessage("Invalid choice. Please choose again");
                choice = newMenu.DisplayMenu();
            }
        } //End of while loop
    } //End of Main
}
