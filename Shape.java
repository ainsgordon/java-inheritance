public class Shape {

    protected double area;

    public Shape(double area) {
        this.area = area;
    }

    public Shape(double height, double width) {
        area = height*width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }


}
