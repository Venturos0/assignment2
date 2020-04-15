package com.company;

public class Point {
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //setters
    public void setX(int newX){
        x = newX;
    }
    public void setY(int newY){
        y = newY;
    }
    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(Point p){
        int horDist = (int)Math.pow(this.x -p.getX(), 2);
        int verDist = (int)Math.pow(this.y -p.getY(), 2);
        return Math.sqrt(horDist + verDist);
    }
}