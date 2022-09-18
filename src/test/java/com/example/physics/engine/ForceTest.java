package com.example.physics.engine;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.physics.shape.Circle;
import com.example.physics.shape.Shape;
import com.example.physics.vector.Vector;
import org.junit.jupiter.api.Test;

class ForceTest {
  Vector forceVector = new Vector(10, 5);
  Shape circle = new Circle(2.8, new Vector(2, 4), new Vector(2, 4), new Vector(2, 4));

  @Test
  void applyForce() {
    Vector acceleration = forceVector.divide(circle.mass);
    Vector expectedForce = circle.acceleration.addVector(acceleration);

    Vector actual = Force.applyForce(forceVector, circle);

    assertThat(actual.getX()).isEqualTo(expectedForce.getX());
    assertThat(actual.getY()).isEqualTo(expectedForce.getY());
  }
}
