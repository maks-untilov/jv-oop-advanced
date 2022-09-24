package core.basesyntax;

public class Circle extends Figure{
    private int radius = 10;

    public Circle(int radius, String Color) {
        super(Color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " +
                "circle, " +
                "area: " + String.format("%.2f", calculateArea()) + " sq.units, " +
                "radius: " + radius + " units, " +
                "color: " + getColor().toLowerCase());
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
