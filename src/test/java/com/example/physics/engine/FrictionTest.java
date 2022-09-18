package com.example.physics.engine;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.physics.shape.Circle;
import com.example.physics.shape.Shape;
import com.example.physics.vector.Vector;
import org.junit.jupiter.api.Test;

class FrictionTest {

  Shape circle = new Circle(3, new Vector(1, 2), new Vector(9, 10), new Vector(4, 2));

  @Test
  void applyFriction() {
    Vector velocity = circle.getVelocity();
    Vector invertedFriction = velocity.invert();
    Vector normalisedFriction = invertedFriction.normaliseVector();
    Vector finalFriction = normalisedFriction.multiply(1 * 0.5);
    Vector expected = Force.applyForce(finalFriction, circle);

    Vector actual = Friction.applyFriction(circle);

    assertThat(actual.getY()).isEqualTo(expected.getY());
    assertThat(actual.getX()).isEqualTo(expected.getX());
  }
}
