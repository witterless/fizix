package com.example.physics.vector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VectorTest {
  Vector vector = new Vector(2, 2);

  @Test
  void scaleMagnitude() {
    var newMag = 2 * Math.sqrt((vector.getX() * vector.getX()) + (vector.getY() * vector.getY()));
    var angle = Math.atan2(vector.getX(), vector.getY()) * 180 / Math.PI;

    Vector expected = new Vector(Math.cos(angle) * newMag, Math.sin(angle) * newMag);
    Vector actual = vector.scaleMagnitude(2);

    assertThat(actual.getX()).isEqualTo(expected.getX());
    assertThat(actual.getY()).isEqualTo(expected.getY());
  }

  @Test
  void addVector() {
    Vector actual = vector.addVector(new Vector(1, 1));

    assertThat(actual.getX()).isEqualTo(3);
    assertThat(actual.getY()).isEqualTo(3);
  }

  @Test
  void subtractVector() {
    Vector actual =vector.subtractVector(new Vector(1, 1));

    assertThat(actual.getX()).isEqualTo(1);
    assertThat(actual.getY()).isEqualTo(1);
  }

  @Test
  void addY() {
    Vector actual =vector.addY(6);

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(8);
  }

  @Test
  void addX() {
    Vector actual =vector.addX(6);

    assertThat(actual.getX()).isEqualTo(8);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void subtractY() {
    Vector actual =vector.subtractY(6);

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(-4);
  }

  @Test
  void subtractX() {
    Vector actual =vector.subtractX(6);

    assertThat(actual.getX()).isEqualTo(-4);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void setVector() {
    Vector actual = vector.setVector(new Vector(10, 30));

    assertThat(actual.getX()).isEqualTo(10);
    assertThat(actual.getY()).isEqualTo(30);
  }

  @Test
  void multiply() {
    Vector actual = vector.multiply(10);

    assertThat(actual.getX()).isEqualTo(20);
    assertThat(actual.getY()).isEqualTo(20);
  }

  @Test
  void multiplyY() {
    Vector actual = vector.multiplyY(10);

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(20);
  }

  @Test
  void multiplyX() {
    Vector actual = vector.multiplyX(10);

    assertThat(actual.getX()).isEqualTo(20);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void divideVector_xEquals0() {
    Vector actual = vector.divideVector(new Vector(0, 2));

    assertThat(actual.getX()).isEqualTo(0);
    assertThat(actual.getY()).isEqualTo(1);
  }

  @Test
  void divideVector_yEquals0() {
    Vector actual = vector.divideVector(new Vector(2, 0));

    assertThat(actual.getX()).isEqualTo(1);
    assertThat(actual.getY()).isEqualTo(0);
  }

  @Test
  void divideVector_bothEqual0() {
    Vector actual = vector.divideVector(new Vector(0, 0));

    assertThat(actual.getX()).isEqualTo(0);
    assertThat(actual.getY()).isEqualTo(0);
  }

  @Test
  void invert() {
    Vector actual = vector.invert();

    assertThat(actual.getX()).isEqualTo(-2);
    assertThat(actual.getY()).isEqualTo(-2);
  }

  @Test
  void invertVectorY() {
    Vector actual = vector.invertY();

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(-2);
  }

  @Test
  void invertVectorX() {
    Vector actual = vector.invertX();

    assertThat(actual.getX()).isEqualTo(-2);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void dotProduct() {
    Vector dotProductVector = new Vector(10, 10);
    double expected =
        (vector.getX() * dotProductVector.getY()) + (vector.getY() * dotProductVector.getY());

    double actual = vector.dotProduct(dotProductVector);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void normaliseVector() {
    double mag = Math.sqrt((vector.getX() * vector.getX()) + (vector.getY() * vector.getY()));
    Vector expected = new Vector(vector.getX() / mag, vector.getY() / mag);
    Vector actual = vector.normaliseVector();

    assertThat(actual.getX()).isEqualTo(expected.getX());
    assertThat(actual.getY()).isEqualTo(expected.getY());
  }

  @Test
  void divide() {
    Vector actual = vector.divide(0.5);

    assertThat(actual.getX()).isEqualTo(4);
    assertThat(actual.getY()).isEqualTo(4);
  }

  @Test
  void divide_by0() {
    Vector actual = vector.divide(0);

    assertThat(actual.getX()).isEqualTo(0);
    assertThat(actual.getY()).isEqualTo(0);
  }

  @Test
  void divideY() {
    Vector actual = vector.divideY(0.5);

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(4);
  }

  @Test
  void divideX() {
    Vector actual = vector.divideX(0.5);

    assertThat(actual.getX()).isEqualTo(4);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void divideY_by0() {
    Vector actual = vector.divideY(0);

    assertThat(actual.getX()).isEqualTo(2);
    assertThat(actual.getY()).isEqualTo(0);
  }

  @Test
  void divideX_by0() {
    Vector actual = vector.divideX(0);

    assertThat(actual.getX()).isEqualTo(0);
    assertThat(actual.getY()).isEqualTo(2);
  }

  @Test
  void crossProduct() {
    var expectedVector = new Vector(7, 8);
    var expected = vector.getX() * expectedVector.getY() - vector.getY() * expectedVector.getX();
    var actual = vector.crossProduct(expectedVector);

    assertThat(actual).isEqualTo(expected);
  }
}
