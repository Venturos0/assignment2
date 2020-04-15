package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println("Enter coordinates:");
        while (in.hasNextLine()){
            String line = in.nextLine();
            if(line.isEmpty())    break;
            String[] s = line.split(", ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        ArrayList<Point> points = shape.getPoints();
        System.out.println("Distance between first and last points: " + points.get(0).distance(points.get(points.size()-1)) + " cm.");
        shape.calculatePerimeter();
        System.out.println("Longest side of shape is " + shape.getLongestSide() + " cm.");
        System.out.println("Average length of all sides of shape is " + shape.getAverageLength() + " cm.");
    }
}
