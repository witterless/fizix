package com.example.physics.vector;

public class Vector {

  private final double x;
  private final double y;

  public Vector(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Vector multiply(double num) {
    return new Vector(this.x * num, this.y * num);
  }

  public Vector multiplyY(double num) {
    return new Vector(this.x, this.y * num);
  }

  public Vector multiplyX(double num) {
    return new Vector(this.x * num, this.y);
  }

  public Vector divide(double value) {
    if (value != 0) {
      return new Vector(this.x / value, this.y / value);
    } else {
      return new Vector(0, 0);
    }
  }

  public Vector divideY(double value) {
    if (value != 0) {
      return new Vector(this.x, this.y / value);
    } else {
      return new Vector(this.x, 0);
    }
  }

  public Vector divideX(double value) {
    if (value != 0) {
      return new Vector(this.x / value, this.y);
    } else {
      return new Vector(0, this.y);
    }
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public Vector scaleMagnitude(double num) {
    double newMagnitude = num * this.magnitude();
    double angle = this.findAngle();
    double nx = Math.cos(angle) * newMagnitude;
    double ny = Math.sin(angle) * newMagnitude;
    return new Vector(nx, ny);
  }

  public Vector addVector(Vector vector) {
    return new Vector(this.x + vector.getX(), this.y + vector.getY());
  }

  public Vector subtractVector(Vector vector) {
    return new Vector(this.x - vector.getX(), this.y - vector.getY());
  }

  public Vector addY(double y) {
    return new Vector(this.x, this.y + y);
  }

  public Vector addX(double x) {
    return new Vector(this.x + x, this.y);
  }

  public Vector subtractY(double y) {
    return new Vector(this.x, this.y - y);
  }

  public Vector subtractX(double x) {
    return new Vector(this.x - x, this.y);
  }

  public Vector setVector(Vector vector) {
    return new Vector(vector.getX(), vector.getY());
  }

  public Vector divideVector(Vector vector) {
    double x = 0;
    double y = 0;

    if (vector.getX() != 0 || vector.getY() != 0) {
      x = this.x / vector.getX();
      y = this.y / vector.getY();
    }
    if (vector.getX() == 0) {
      x = 0;
    }
    if (vector.getY() == 0) {
      y = 0;
    }
    return new Vector(x, y);
  }

  public Vector invert() {
    return new Vector(this.x * -1, this.y * -1);
  }

  public Vector invertX() {
    return new Vector(this.x * -1, this.y);
  }

  public Vector invertY() {
    return new Vector(this.x, this.y * -1);
  }

  public Vector normaliseVector() {
    double mag = this.magnitude();
    if (mag == 0) {
      return new Vector(0, 0);
    } else {
      return new Vector(this.x / mag, this.y / mag);
    }
  }

  private double magnitude() {
    return Math.sqrt((this.x * this.x) + (this.y * this.y));
  }

  private double findAngle() {
    return Math.atan2(this.x, this.y) * 180 / Math.PI;
  }

  public double dotProduct(Vector vector) {
    return (this.x * vector.getX()) + (this.y * vector.getY());
  }

  public double crossProduct(Vector vector) {
    return (this.x * vector.getY() - this.y * vector.getX());
  }

  @Override
  public String toString() {
    return "Vector{" + "x=" + x + ", y=" + y + '}';
  }
}
