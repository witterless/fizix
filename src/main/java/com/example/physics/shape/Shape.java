package com.example.physics.shape;

import com.example.physics.vector.Vector;

public class Shape {

  public double mass;
  public Vector location;
  public Vector velocity;
  public Vector acceleration;

  public Shape() {}

  public Shape(double mass, Vector location, Vector velocity, Vector acceleration) {
    this.mass = mass;
    this.location = location;
    this.velocity = velocity;
    this.acceleration = acceleration;
  }

  public double getMass() {
    return mass;
  }

  public Vector getLocation() {
    return location;
  }

  public Vector getVelocity() {
    return velocity;
  }

  public Vector getAcceleration() {
    return acceleration;
  }
}
