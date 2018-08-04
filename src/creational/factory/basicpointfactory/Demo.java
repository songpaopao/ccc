package creational.factory.basicpointfactory;

public class Demo {
    public static void main(String[] args) {
        Point point = Point.Factory.newPolarPoint(2, 3);
    }
}
