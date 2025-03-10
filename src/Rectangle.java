public class Rectangle implements Figures {
    int a, b;
    String FillColor;
    String BorderColor;

    public Rectangle(int a, int b, String FillColor, String BorderColor) {
        this.a = a;
        this.b = b;
        this.FillColor = FillColor;
        this.BorderColor = BorderColor;
    }

    public void Perimetr() {
        int P = a + a + b + b;
        System.out.println("Периметр прямоугольника: " + P);
    }

    public void Square() {
        int S = a * b;
        System.out.println("Площадь прямоугольника: " + S);
    }

    public void FillingColor() {
        System.out.println("Цвет заливки: " + FillColor);
    }

    public void BorderColor() {
        System.out.println("Цвет границы: " + BorderColor);
    }
}
