package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String Color, int firstLeg, int secondLeg) {
        super(Color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " +
                "rightTriangle, " +
                "area: " + calculateArea() + " sq.units, " +
                "firstLeg: " + firstLeg + " units, " +
                "secondLeg: " + secondLeg + " units, " +
                "color: " + getColor().toLowerCase());
    }
}