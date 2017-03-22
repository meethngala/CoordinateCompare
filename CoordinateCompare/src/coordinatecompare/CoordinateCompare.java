/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinatecompare;

import java.util.Scanner;

/**
 * class for coordinates points
 * @author Meeth
 */
public class CoordinateCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        Point p = new Point();// creating a reference of Class point
        
        CompareY y= new CompareY();
        //System.out.println("The result of compare method is:" +y.compare(p1, p2));
        
        p.plotPoints();// calling the plotPoint method
    }
    
}
