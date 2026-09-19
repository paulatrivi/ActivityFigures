
import java.util.Arrays;

public static void main(String[] args) {
    Shape[] v = new Shape[4];

    v[0] = new Rectangle(5, 3);
    v[1] = new Circle(5);
    v[2] = new Square(5);
    v[3] = new Triangle(120, 200);

    double res = sum(v);

    System.out.println("sum: " + res + "units");

    print(v);

    sort(v);

    print(v);
}
private static double sum(Shape[] shapes)
{
    double sum =0;
    for(Shape s :shapes) {
    sum+=s.getArea();
    }
    return sum;

}

private static void print(Shape[] shapes) {
    for (Shape s : shapes) {
        System.out.println(s);
    }
}

private static void sort(Shape[] shapes) {
    Arrays.sort(shapes, (s1,s2) -> Double.compare(s2.getArea(),s1.getArea()));
    }

