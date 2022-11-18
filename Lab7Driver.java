
public class Lab7Driver {

    public static void main (String [] args){

        // notice that the left declaration is of Shape and the right is Square
        // This is an example of Polymorphism
        Shape square = new Square(9.7, 9.7);


        // again the left is Shape but this time the right is Rectangle
        // another example of Polymorphism
        Shape rect = new Rectangle(6.8, 4.3);


        // neither Square or Rectangle have a getArea method but Shape does
        // so Square and Rectangle can use Shapes getArea method
        System.out.println("The area of the square is: " + square.getArea() + " and it's perimeter is " + ((Square) square).getPerimeter());
        System.out.println("The area of the rectangle is: " + rect.getArea() + " and it's perimeter is " + ((Rectangle) rect).getPerimeter());
    }
}

