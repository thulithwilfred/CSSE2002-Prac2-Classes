package com.UQ;

public class Main {

    public static void main(String[] args) {
        Point start = new Point(-2.0f, 5.0f);
        Point end = new Point(69.0f, 10.0f);

        /*
        System.out.println("Init");
        System.out.println(start.getX() +"  "+ start.getY()+"\n");
        System.out.println(end.getX() +"  "+ end.getY()+"\n");
        */

        Line line = new Line(start, end);

        System.out.println("-------Getting Length--------");

        System.out.println(line.getLength());

        System.out.println("--------Moving Start/End-Post Move-------");

        line.moveStart(100f, 100f);
        line.moveEnd(200f, 200f);

        System.out.println(line.getLength());

        Point test = start.flipPoint();
        System.out.println(test.getX());

        System.out.println("--------DEBUG------");
        System.out.println(end.toString());

    }
    
}
