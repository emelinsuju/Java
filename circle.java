public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circle Properties (Radius = " + radius + "):");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        myCircle.display();
    }
}
