package com.java4web;

public class TriangleApp {

    public static void main(String[] args) {
        Point A = new Point(2,5);
        Point B = new Point(2,7);
        Point C = new Point(3  ,9);
        Triangle ABC = new Triangle(A,B,C);
        if((A.x==B.x && A.x==C.x)||(A.y==B.y && A.y==C.y)){
            System.out.print("This is not a triangle");
        }
        else System.out.print(ABC.perimeter());
    }
}
