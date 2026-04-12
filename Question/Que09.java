/*
Create a class ‘Rectangle’ that contains ‘length’ and ‘width’ as data 
members. From this class derive class box which has additional data 
member ‘depth’. Class ‘Rectangle’ consists of a constructor and an              
area ( ) function. The derived ‘Box’ class have a constructor and override 
function named area ( ) which returns surface area of ‘Box’ and a volume ( ) 
function. Write a java program calling all the member function.
*/

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Box extends Rectangle {
    double depth;

    Box(double length, double width, double depth) {
        super(length, width); 
        this.depth = depth;
    }
    double area() {
        return 2 * (length * width + width * depth + length * depth);
    }
    double volume() {
        return length * width * depth;
    }
}

public class Que09 {
    public static void main(String[] args) {
        // Create Rectangle object
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.area());

        // Create Box object
        Box box = new Box(5, 10, 3);
        System.out.println("Surface Area of Box: " + box.area());
        System.out.println("Volume of Box: " + box.volume());
    }
}