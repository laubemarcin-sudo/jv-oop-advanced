package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaMeasurable, Drawable {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq. units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
