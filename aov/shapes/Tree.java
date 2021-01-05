package aov.shapes;

import aov.draw.Draw;
import aov.shapes.Circle;
import aov.shapes.Compound;
import aov.shapes.Rectangle;
import aov.shapes.Triangle;

import java.awt.*;

public class Tree {
    public Tree() {
        Draw draw = new Draw();

        draw.loadShapes(
                new Compound(
                    new Circle(50, 50, 50, Color.GREEN),
                    new Rectangle(100, 150, 10, 50, Color.GRAY)
                    )
        );
    }
}
