package aov.shapes;

import aov.editor.ImageEditor;
import aov.shapes.Circle;
import aov.shapes.Compound;
import aov.shapes.Dot;
import aov.shapes.Rectangle;
import aov.shapes.Triangle;

import java.awt.*;

public class House {
    public House() {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Compound(
                    new Triangle(50, 50, 100, 100, Color.GRAY),
                    new Rectangle(50, 100, 100, 100, Color.GREEN)
                    )
        );
    }
}
