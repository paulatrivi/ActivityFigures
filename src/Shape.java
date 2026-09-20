public abstract class Shape implements Comparable<Shape> {
    public abstract double getArea();

    public int compareTo(Shape other){
        return Double.compare(other.getArea(), this.getArea());
    }
}
