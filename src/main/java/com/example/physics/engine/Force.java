package com.example.physics.engine;

import com.example.physics.shape.Shape;
import com.example.physics.vector.Vector;

public class Force {

  public static Vector applyForce(Vector force, Shape shape) {
    Vector acceleration = force.divide(shape.mass);
    return shape.acceleration.addVector(acceleration);
  }

}
