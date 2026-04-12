// Write a program to create vector with five elements as  
// (5, 15, 25, 35, 45). Insert new element at 2nd position. 
// Remove 1st and 4th element from vector.

import java.util.Vector;

public class Que05 {
    public static void main(String[] args) {

        Vector <Integer> v = new Vector<>();        
        v.add(5);
        v.add(15);
        v.add(25);
        v.add(35);
        v.add(45);

        v.insertElementAt(100, 2);
        v.remove(0);
        v.remove(3);
        System.out.println(v);
    }    
}
