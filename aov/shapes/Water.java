package aov.shapes;

import aov.shapes.Circle;
import aov.shapes.Compound;
import aov.shapes.Dot;
import aov.shapes.Rectangle;
import aov.shapes.Triangle;
import aov.draw.Draw;

import java.awt.*;

public class Water {
    public Water() {
        Draw draw = new Draw();

        draw.loadShapes(
                new Compound(
                    new Triangle(100, 50, 100, 100, Color.BLUE),
                    new Circle(50, 50, 50, Color.BLUE)
                    )
        );
    }
}
