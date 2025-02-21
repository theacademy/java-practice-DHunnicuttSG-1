package org.example.Day1;

public class CalcPerimeter {
    // Calculate the perimeter of an object given x, y coordinates on a 2D grid
    public static void main(String[] args) {
        //Test shape
        Point t1 = new Point(0,0);
        Point t2 = new Point(0,2);
        Point t3 = new Point(2,2);
        Point t4 = new Point(2,0);

        double distance = 0.0;
        distance = CalcPerim(t1, t2);
        distance += CalcPerim(t2, t3);
        distance += CalcPerim(t3, t4);
        distance += CalcPerim(t4, t1);

        System.out.println("The perimeter of the shape is: " + String.format("%.2f", distance));

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,4);
        Point p3 = new Point(4,4);
        Point p4 = new Point(4,3);
        Point p5 = new Point(4,1);
        Point p6 = new Point(3,0);

        distance = 0.0;
        distance = CalcPerim(p1, p2);
        distance += CalcPerim(p2, p3);
        distance += CalcPerim(p3, p4);
        distance += CalcPerim(p4, p5);
        distance += CalcPerim(p5, p6);
        distance += CalcPerim(p6, p1);

        System.out.println("The perimeter of the shape is: " + String.format("%.2f", distance));

    }

    public static double CalcPerim(Point p1, Point p2) {
        double distance = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y),2));
        System.out.println(distance);
        return distance;
    }

}
