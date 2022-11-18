public class Square extends Shape {

    private double perimeter;

    public Square(double height, double width) {
        super(height, width);
        perimeter = (2*height) + (2*width);
//        setArea(height*width);
//        area = height *width;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
