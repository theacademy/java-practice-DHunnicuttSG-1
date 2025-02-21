package org.example.Day4.UI;

public class App {
    public static void main(String[] args) {
        UserIO myIO = new UserIOConsoleImpl();

        //myIO.print("This is a test");
        //myIO.readInt("Type in a number");
        //String test = myIO.readString("Type in anything.");
        //myIO.print(test);

        int test = myIO.readInt("Number: ");

        myIO.print(test);
    }
}
