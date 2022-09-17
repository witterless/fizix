package com.example.physics.vector;

public class Vector {

  private double x;
  private double y;

  public Vector(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Vector multiply(double num) {
    this.x *= num;
    this.y *= num;
    return new Vector(this.x, this.y);
  }

  public Vector multiplyY(double num) {
    this.y *= num;
    return new Vector(this.x, this.y);
  }

  public Vector multiplyX(double num) {
    this.x *= num;
    return new Vector(this.x, this.y);
  }

  public Vector divide(double value) {
    if (value != 0) {
      this.x /= value;
      this.y /= value;
    } else {
      this.x = 0;
      this.y = 0;
    }
    return new Vector(this.x, this.y);
  }

  public Vector divideY(double value) {
    if (value != 0) {
      this.y /= value;
    } else {
      this.y = 0;
    }
    return new Vector(this.x, this.y);
  }

  public Vector divideX(double value) {
    if (value != 0) {
      this.x /= value;
    } else {
      this.x = 0;
    }
    return new Vector(this.x, this.y);
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

  private double magnitude() {
    return Math.sqrt((this.x * this.x) + (this.y * this.y));
  }

  private double findAngle() {
    return Math.atan2(this.x, this.y) * 180 / Math.PI;
  }

  public Vector addVector(Vector vector) {
    this.x += vector.x;
    this.y += vector.y;
    return new Vector(this.x, this.y);

  }

  public Vector subtractVector(Vector vector) {
    this.x -= vector.x;
    this.y -= vector.y;
    return new Vector(this.x, this.y);

  }

  public Vector addY(double y) {
    this.y += y;
    return new Vector(this.x, this.y);

  }

  public Vector addX(double x) {
    this.x += x;
    return new Vector(this.x, this.y);

  }

  public Vector subtractY(double y) {
    this.y -= y;
    return new Vector(this.x, this.y);

  }

  public Vector subtractX(double x) {
    this.x -= x;
    return new Vector(this.x, this.y);

  }

  public Vector setVector(Vector vector) {
    this.x = vector.x;
    this.y = vector.y;
    return new Vector(this.x, this.y);
  }

  public Vector divideVector(Vector vector) {
    if (vector.x != 0 || vector.y != 0) {
      this.x /= vector.x;
      this.y /= vector.y;
    }
    if (vector.x == 0) {
      this.x = 0;
    }
    if (vector.y == 0) {
      this.y = 0;
    }
    return new Vector(this.x, this.y);
  }

  public Vector invert() {
    this.x *= -1;
    this.y *= -1;
    return new Vector(this.x, this.y);
  }

  public Vector invertX() {
    this.x *= -1;
    return new Vector(this.x, this.y);
  }

  public Vector invertY() {
    this.y *= -1;
    return new Vector(this.x, this.y);
  }

  public double dotProduct(Vector vector) {
    return (this.x * vector.x) + (this.y * vector.y);
  }

  public double crossProduct(Vector vector) {
    return (this.x * vector.y - this.y * vector.x);
  }

  public Vector normaliseVector() {
    double mag = this.magnitude();
    if (mag == 0) {
      return new Vector(0, 0);
    } else {
      return new Vector(this.x / mag, this.y / mag);
    }
  }

  @Override
  public String toString() {
    return "Vector{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}
