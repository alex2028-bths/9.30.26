public class Circle {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }
    public void printArea() {
        double area = radius * radius * Math.PI ;
        System.out.println("A circle with radius: " + radius + " has an area of: " + area);
    }

}
