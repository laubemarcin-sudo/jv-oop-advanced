package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int RANDOM_BOUND = 10;
    private static final int RANDOM_OFFSET = 1;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Circle(getRandomValue(), color);
            case 1:
                return new Square(getRandomValue(), color);
            case 2:
                return new Rectangle(getRandomValue(), getRandomValue(), color);
            case 3:
                return new RightTriangle(getRandomValue(), getRandomValue(), color);
            case 4:
            default:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue(), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomValue() {
        return random.nextDouble() * RANDOM_BOUND + RANDOM_OFFSET;
    }
}
