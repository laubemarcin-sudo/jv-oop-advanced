package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);

        double val1 = random.nextDouble() * 10 + 1;
        double val2 = random.nextDouble() * 10 + 1;
        double val3 = random.nextDouble() * 10 + 1;

        switch (figureType) {
            case 0:
                return new Square(val1, color);
            case 1:
                return new Circle(val1, color);
            case 2:
                return new Rectangle(val1, val2, color);
            case 3:
                return new RightTriangle(val1, val2, color);
            case 4:
            default:
                return new IsoscelesTrapezoid(val1, val2, val3, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
