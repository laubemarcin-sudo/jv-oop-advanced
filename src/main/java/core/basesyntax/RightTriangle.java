package core.basesyntax;

public class NazwaFigury extends Figure implements AreaMeasurable {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
