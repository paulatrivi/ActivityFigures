public class Rectangle implements Shape{
    double lado1;
    double lado2;

    Rectangle(double lado1, double lado2)    {
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public double getArea() {
        return lado1*lado2;
    }
}
