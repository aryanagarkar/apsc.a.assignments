package com.mycompany.graphicfigures;

import java.awt.*;

public class Main {

    public static final int PANELLENGTH = 400;
    public static final int PANELWIDTH = 400;
    public static final Color BACKGROUNDCOLOR = Color.CYAN;
    public static final Color FILLCOLOR = Color.GREEN;
    public static final Color OUTLINECOLOR = Color.BLACK;
    public static final Color CIRCLECOLOR = Color.YELLOW;

    public static final Point RECT1_POINT = new Point(0, 0);
    public static final int RECT1_NUMCIRCLES = 5;
    public static final int RECT1_ROWS = 1;
    public static final int RECT1_SUBFIGURESIZE = 100;
    public static final int RECT1_LENGTH = RECT1_SUBFIGURESIZE * RECT1_ROWS;

    public static final Point RECT2_POINT = new Point(10, 120);
    public static final int RECT2_NUMCIRCLES = 4;
    public static final int RECT2_ROWS = 5;
    public static final int RECT2_SUBFIGURESIZE = 24;
    public static final int RECT2_LENGTH = RECT2_SUBFIGURESIZE * RECT2_ROWS;

    public static final Point RECT3_POINT = new Point(150, 20);
    public static final int RECT3_NUMCIRCLES = 5;
    public static final int RECT3_ROWS = 6;
    public static final int RECT3_SUBFIGURESIZE = 40;
    public static final int RECT3_LENGTH = RECT3_SUBFIGURESIZE * RECT3_ROWS;

    public static final Point RECT4_POINT = new Point(130, 275);
    public static final int RECT4_NUMCIRCLES = 3;
    public static final int RECT4_ROWS = 3;
    public static final int RECT4_SUBFIGURESIZE = 36;
    public static final int RECT4_LENGTH = RECT4_SUBFIGURESIZE * RECT4_ROWS;

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(PANELLENGTH, PANELWIDTH);
        panel.setBackground(BACKGROUNDCOLOR);
        Graphics graphics = panel.getGraphics();

        drawRect(graphics, RECT1_POINT, RECT1_LENGTH);
        drawRect(graphics, RECT2_POINT, RECT2_LENGTH);
        drawRect(graphics, RECT3_POINT, RECT3_LENGTH);
        drawRect(graphics, RECT4_POINT, RECT4_LENGTH);

        drawCircleGrid(graphics, RECT1_POINT, RECT1_ROWS, RECT1_SUBFIGURESIZE,
                RECT1_NUMCIRCLES);
        drawCircleGrid(graphics, RECT2_POINT, RECT2_ROWS, RECT2_SUBFIGURESIZE,
                RECT2_NUMCIRCLES);
        drawCircleGrid(graphics, RECT3_POINT, RECT3_ROWS, RECT3_SUBFIGURESIZE,
                RECT3_NUMCIRCLES);
        drawCircleGrid(graphics, RECT4_POINT, RECT4_ROWS, RECT4_SUBFIGURESIZE,
                RECT4_NUMCIRCLES);
    }

    private static void drawRect(Graphics graphics, Point p,
            int length) {
        graphics.setColor(FILLCOLOR);
        graphics.fillRect(p.getX(), p.getY(), length, length);
        graphics.setColor(OUTLINECOLOR);
        graphics.drawRect(p.getX(), p.getY(), length, length);

    }

    private static void drawSubCircle(Graphics graphics, Point p, int diameter) {
        graphics.setColor(CIRCLECOLOR);
        graphics.fillOval(p.getX(), p.getY(), diameter, diameter);
        graphics.setColor(OUTLINECOLOR);
        graphics.drawOval(p.getX(), p.getY(), diameter, diameter);
    }

    private static void drawCircle(Graphics graphics, int num, final Point p,
            final int diameter) {
        int diameterOffset = diameter / num;
        int xOffset = diameterOffset / 2;
        int yOffset = diameterOffset / 2;
        for (int i = 0; i < num; i++) {
            drawSubCircle(graphics, new Point(p.getX() + xOffset * i,
                    p.getY() + yOffset * i), diameter - diameterOffset * i);
        }
        graphics.drawLine(p.getX(), p.getY() + diameter / 2, p.getX() + diameter,
                 p.getY() + diameter / 2);
        graphics.drawLine(p.getX() + diameter / 2, p.getY(),
                p.getX() + diameter / 2, p.getY() + diameter);
        graphics.drawLine(p.getX(), p.getY(), p.getX(), p.getY() + diameter);

    }

    private static void drawCircleGrid(Graphics graphics, final Point p,
            final int rows, final int diameter, final int numCircles) {
        int x = p.getX();
        int y = p.getY();
        int diam = diameter;
        for (int i = 0; i < rows * rows; i++) {
            if (i != 0 && i % rows == 0) {
                y += diameter;
                x = p.getX();
            }
            drawCircle(graphics, numCircles, new Point(x, y), diameter);
            x += diameter;
        }
    }
}
