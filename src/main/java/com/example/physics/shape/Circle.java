package com.example.physics.shape;

import com.example.physics.vector.Vector;

public class Circle extends Shape {

  public Circle() {}

  public Circle(double mass, Vector location, Vector velocity, Vector acceleration) {
    super(mass, location, velocity, acceleration);
  }
}
