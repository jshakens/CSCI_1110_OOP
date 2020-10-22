public class Rectangle {

    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    void Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
        System.out.println("Width = "+width);
        System.out.println("height= "+height);
    }

    void getArea() {
        double area = width * height;
        System.out.println("Area = "+ area);
    }

    void getPerimeter() {
        double perimeter = ((width * 2) + (height * 2));
        System.out.println("Perimeter = "+ perimeter);
    }
}
