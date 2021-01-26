package com.UQ;

public class Line {

    private Point start, end;
    private double lenLine;

    /* Default Constructor */
    Line() {
        this.start = new Point();
        this.end = new Point();
        this.lenLine =  0.00;
    }
    /* Constructor 2 */
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.lenLine = lineLength(start, end);
    }

    /* Return the line length, private function */
    private static double lineLength(Point start, Point end) {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    /* Line flipLine() which returns a new object that is the ‘flipped’ version of this Line */
    Line flipLine() {
        return new Line(start.flipPoint(), end.flipPoint());
    }

    /* Point middle() which returns the mid-point of the start and end of the line */
    public Point middle() {
        float xMid = (this.end.getX() + this.start.getX()) / 2;
        float yMid = (this.end.getY() + this.start.getY()) / 2;

        return new Point(xMid, yMid);
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    public double getLength() {
        this.lenLine = lineLength(this.start, this.end);
        return this.lenLine;
    }

    public void moveStart(float dX, float dY) {
        this.start = this.start.movePoint(dX, dY);
    }

    public void moveEnd(float dX, float dY) {
        this.end = this.end.movePoint(dX, dY);
    }

}
