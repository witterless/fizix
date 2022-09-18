package com.example.physics.engine;

import com.example.physics.shape.Circle;
import com.example.physics.vector.Vector;

public class Friction {

  private static final double COEFFICIENT_OF_FRICTION = 0.5;
  private static final double NORMAL = 1;

  public static Vector applyFriction(Circle circle) {
    Vector friction = circle.velocity;
    friction.invert();

    //convert scalar to vector
    Vector normalisedFriction = friction.normaliseVector();
    Vector finalFriction = normalisedFriction.multiply(NORMAL * COEFFICIENT_OF_FRICTION);
    return Force.applyForce(finalFriction, circle);
  }

}
