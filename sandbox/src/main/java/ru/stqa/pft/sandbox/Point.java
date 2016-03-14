package ru.stqa.pft.sandbox;

/**
 * Created by Irina on 3/12/2016.
 */
public class Point {
  public double x;
  public double y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.y - p2.y) * (p1.y - p2.y) + (p1.x - p2.x) * (p1.x - p2.x));

  }
}
