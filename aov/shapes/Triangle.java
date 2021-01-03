package aov.shapes;

import java.awt.*;

public class Triangle extends BaseShape {
    public int width;
    public int height;

    public Triangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int x[]={100,50,150};
        int y[]={10,100,100};
        graphics.drawPolygon(x, y, 3);
    }
}