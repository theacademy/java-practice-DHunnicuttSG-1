package org.example.Day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatesExample {
    public static void main(String[] args) throws FileNotFoundException {
        // Create list to store data
        List<StateData> stateDataList = new ArrayList<>();

        // create a list of state capitals from file
        Scanner sc = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        // go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] myData = currentLine.split("::");
            String stateName = myData[0];
            String stateCapital = myData[1];
            float population = Float.parseFloat(myData[2]);
            float area = Float.parseFloat(myData[3]);
            StateData newStateData = new StateData(stateName, stateCapital, population, area);
            stateDataList.add(newStateData);
        }

        for (StateData item : stateDataList) {
            System.out.println(item.stateName + " : " + item.stateCapital);
        }
    }

    public StatesExample() throws FileNotFoundException {
    }
}
