package aov.shapes;

import java.awt.*;

public class Triangle extends BaseShape {
    public int width;
    public int height;
    public int start;
    public int end;

    public Triangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
        this.start = x;
        this.end = y;
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
        graphics.fillPolygon(x, y, 3);
    }
}