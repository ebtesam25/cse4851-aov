package aov.shapes;

import java.awt.*;

import aov.draw.Draw;

public class House {
    public House() {
        Draw draw = new Draw();

        draw.loadShapes(
                new Compound(
                    new Triangle(50, 50, 100, 100, Color.GRAY),
                    new Rectangle(50, 100, 100, 100, Color.GRAY)
                    )
        );
    }
}
