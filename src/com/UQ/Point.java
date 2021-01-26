package com.UQ;

public class Point {

    private final float x, y;

    /* Constructor Takes no arguments */
    Point() {
        this.y = 0;
        this.x = 0;
    }

    /* Constructor Takes 2 Floats */
    Point(float setX, float setY) {
        this.x = setX;
        this.y = setY;
    }

    /*  Line createLine(Point end) which returns a Line object with 'this' as the start and
    'end' as the end */
    public Line createLine(Point end) {
        return new Line(this, end);
    }

    /*Returns a new object that is the ‘flipped’ version of this Point
    (that is, the sign of both its x- and y-coordinate should be changed → (1, −5) becomes (−1, 5)). */
    public Point flipPoint() {
        return new Point(this.x * -1, this.y * -1);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
    /* Create new object of class point and increment X and Y with + dX, dY */
    public Point movePoint(float deltaX, float deltaY) {
        return new Point(x + deltaX, y + deltaY);
    }
}
