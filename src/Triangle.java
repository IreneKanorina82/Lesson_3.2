public class Triangle implements Figures {
    int a, b, c, h;
    String FillColor;
    String BorderColor;

    public Triangle(int a, int b, int c, int h, String FillColor, String BorderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.FillColor = FillColor;
        this.BorderColor = BorderColor;
    }

    public void Perimetr() {
        int P = a + b + c;
        System.out.println("Периметр треугольника: " + P);
    }

    public void Square() {
        int S = a * h / 2;
        System.out.println("Площадь треугольника: " + S);
    }

    public void FillingColor() {
        System.out.println("Цвет заливки: " + FillColor);
    }

    public void BorderColor() {
        System.out.println("Цвет границы: " + BorderColor);
    }
}
