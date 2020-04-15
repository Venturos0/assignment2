package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();
    private double perimeter = -1;
    private double longestSide = 0;

    public void addPoint(Point p){
        points.add(p);
    }
    public ArrayList<Point> getPoints(){
        return points;
    }
    public void calculatePerimeter(){
        double perimeter = 0;
        for (int i=0; i<points.size(); i++) {
            double line = 0;
            if(i == points.size()-1)    line = points.get(i).distance(points.get(0));
            else line = points.get(i).distance(points.get(i+1));
            longestSide = Math.max(longestSide, line);
            perimeter += line;
        }
        this.perimeter = perimeter;
    }
    public double getLongestSide(){
        if(perimeter == -1)
            calculatePerimeter();
        return longestSide;
    }
    public double getAverageLength(){
        if(perimeter == -1)
            calculatePerimeter();
        return perimeter / points.size();
    }
}