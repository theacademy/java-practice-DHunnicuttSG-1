package org.example.Day2;

public class CodeEval {
    public static void main(String[] args) {
        //PrePost();
        //MyLoops();
        CatTest();

    }

    public static void PrePost(){
        int x = 5;

//        System.out.printf("%s, %s\n", x++, x);
//        System.out.printf("%s, %s\n", ++x, x);

        System.out.println(x++ + ++x);
    }

    public static void MyLoops() {
//        while(true) {
//            System.out.println("Testing");
//        }

        for(;;) {
            System.out.println("Testing");
        }
    }

    public static void CatTest() {
        int a = 5;
        int b = 6;
        String c = "Java";

        System.out.println(a + b + c);
        System.out.println(c + b + a);
    }

}
