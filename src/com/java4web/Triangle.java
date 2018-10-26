package com.java4web;

public class Triangle {

    Point a,b,c;

    Triangle(Point p1,Point p2,Point p3){
        a=p1;
        b=p2;
        c=p3;
    }

    double perimeter(){
        double side1 = Math.sqrt(Math.pow((a.x-b.x),2) + Math.pow((a.y-b.y),2));
        double side2 = Math.sqrt(Math.pow((a.x-c.x),2) + Math.pow((a.y-c.y),2));
        double side3 = Math.sqrt(Math.pow((c.x-b.x),2) + Math.pow((c.y-b.y),2));
        return (side1+side2+side3);
    }
}
