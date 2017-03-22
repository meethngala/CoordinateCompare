/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinatecompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * class to represent points
 * @author Meeth
 */
public class Point implements Comparable<Point>{


    int x;

    /**
     * get x coordinate of the point
     * @return x 
     */
    public int getX() {
        return x;
    }

    /**
     * set the x coordinate of the point
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * get the y coordinate of the point
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * set the y coordinate of the point
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    int y;

    /**
     * no-args constructor of Point
     */
    public Point(){
        
    }

    /**
     * constructor of Point with parameter x and y coordinates
     * @param x
     * @param y
     */
    public Point(int x, int y)
{
    this.x= x;
    this.y= y;
}

    /**
     *
     * @param o1
     * @return integer
     */
    @Override
    public int compareTo(Point o1) {

    if(this.x==o1.x){
        if(this.y==o1.y)
            return 0;
        else if(this.y> o1.y)
            return 1;
        else 
            return -1;
    }
    else if(this.x> o1.x)
        return 1;
    else 
        return -1;
    }

    /**
     * printing 100 random numbers
     */
    public void plotPoints(){
    List<Point> points= new ArrayList<>();
    int tempx;
    int tempy;
    for( int i=0; i<3;i++){
    System.out.println("");}
    System.out.println("****************************************************************");
    System.out.println("Generating 100 random points and sorting X & Y in ascending order");
    for (int i=0; i<100; i++){
        points.add(new Point(getRandomNumber(1, 100), getRandomNumber(1, 100)));
    }
    Collections.sort(points);
    System.out.println("Printing x coordinates sorted i ascending order");
    System.out.println(points);
    Collections.sort(points, new CompareY());
    System.out.println("Printng y coordinates sorted in descending order");
    System.out.println(points);

}    

    /**
     * generates random number in a range
     * @param min
     * @param max
     * @return random number
     */
    public int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * overrides string method
     * @return string
     */
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + "}";
    }
    
 
    
}
