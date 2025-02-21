package org.example.Day1;

public class AddDigits {
    public static void main(String[] args) {
        int[] myNums = new int[7];
        myNums[0] = 16;
        myNums[1] = 999;
        myNums[2] = 4106;
        myNums[3] = 2787;
        myNums[4] = 98765;
        myNums[5] = -56;
        myNums[6] = 0;

        for(int i = 0; i <= myNums.length -1; i++) {
            System.out.println("The number input was: " +
            myNums[i] + "\t" +
                    "   Total of all digits: " +
                    addNums(myNums[i]));
        }
    }

    public static int addNums(int num) {
        int result = 0;
        while (num != 0) {
            int grab = num % 10;
            num /= 10;
            result += grab;
        }
        return Math.abs(result);
    }
}
