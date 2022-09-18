package com.example.physics.engine;

import com.example.physics.shape.Shape;
import com.example.physics.vector.Vector;

public class Force {

  public static Vector applyForce(Vector forceVector, Shape shape) {
    Vector acceleration = forceVector.divide(shape.mass);
    return shape.acceleration.addVector(acceleration);
  }

}
