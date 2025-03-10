public class Circle implements Figures {
    double radius;
    String fillColor;
    String borderColor;

    public Circle(double Radius, String FillColor, String BorderColor) {
        this.radius = Radius;
        this.fillColor = FillColor;
        this.borderColor = BorderColor;
    }

    public void Perimetr() {
        //с=пи*2r
        double C = 3.14 * 2 * radius;
        System.out.println("Периметр круга: " + C);
    }

    public void Square() {
        //S=пи*r в квадрате
        double S = 3.14 * radius * radius;
        System.out.println("Площадь круга: " + S);
    }

    public void FillingColor() {
        System.out.println("Цвет заливки: " + fillColor);
    }

    public void BorderColor() {
        System.out.println("Цвет границы: "+ borderColor);
    }


}
