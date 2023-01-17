package com.example.openclosed;

public class Circle implements Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 3.14 * Math.pow(getRadius(), 2);
  }
}
