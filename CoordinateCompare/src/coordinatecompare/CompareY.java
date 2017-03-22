/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinatecompare;

import java.util.Comparator;

/**
 * class CompareY
 * @author Meeth
 */
public class CompareY implements Comparator<Point>{

    


    @Override
    public int compare(Point o1, Point o2) {
        if(o1.y==o2.y){
        if(o1.x==o2.x)
            return 0;
        else if(o1.x>o2.x)
            return 1;
        else 
            return -1;
}
        else if(o1.y> o2.y)
            return 1;
        else
            return -1;
          
}
}