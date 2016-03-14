package ru.stqa.pft.sandbox;

public class myfirstprogram {

  public static void main(String[] args) {

    System.out.println("Hello, world");
    Point p1 = new Point(0,3);
    Point p2 = new Point(7,0);

    System.out.println(Point.distance(p1, p2));
  }

}