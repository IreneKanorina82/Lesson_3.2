public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "green", "blue");
        circle.Perimetr();
        circle.Square();
        circle.FillingColor();
        circle.BorderColor();
        System.out.println(" ");

        Triangle triangle = new Triangle(3, 2, 4, 2, "orange", "red");
        triangle.Perimetr();
        triangle.Square();
        triangle.FillingColor();
        triangle.BorderColor();
        System.out.println(" ");

        Rectangle rectangle = new Rectangle(2, 4, "grey", "yellow");
        rectangle.Perimetr();
        rectangle.Square();
        rectangle.FillingColor();
        rectangle.BorderColor();
    }
}
