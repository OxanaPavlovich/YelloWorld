public class Circle {

    public static final double PI = 3.14;
    double radius;
    double area;
    double circumference;

    public Circle(double

                          radius) {
        this.radius = radius;
        double Area = Math.PI * (radius * radius);
        double Circumference = Math.PI * 2 * radius;

    }

}
