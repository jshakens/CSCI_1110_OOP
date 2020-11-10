import java.lang.Math;
public class Triangle extends GeometricObject {
    double Side1 = 1.0;
    double Side2 = 1.0;
    double Side3 = 1.0;
    public Triangle(){
    }
     void triangleColor(String color, boolean filled){
        setColor(color);
        setFilled(filled);
         System.out.println("Triangle is "+color);
         System.out.println("Triangle is filled? "+filled);
    }
    void triangle(double S1, double S2, double S3){
        Side1 = S1;
        Side2 = S2;
        Side3 = S3;
    }
    void getPerimeter(){
        double perimeter = (Side1+Side2+Side3);
        System.out.println("Perimeter = "+perimeter);
    }
    void getArea(){
        double S = (Side1+Side2+Side3)/2;
        double squareRoot = (S*((S-Side1)*(S-Side2)*(S-Side3)));
        double area = Math.sqrt(squareRoot);
        System.out.println("Area = "+ area);
    }
    void string(){
        System.out.println("Triangle was created on "+ getDateCreated());
        System.out.println("Triangle: side 1 = " + Side1 + " side 2 = " + Side2 + " side 3 = " + Side3);
    }




}
