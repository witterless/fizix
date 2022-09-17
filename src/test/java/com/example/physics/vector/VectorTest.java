package com.example.physics.vector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VectorTest {

  @Test
  void scaleMagnitude() {
    Vector expected = new Vector(2, 3);
  }

  @Test
  void addVector() {
    Vector vector = new Vector(2, 2);

    vector.addVector(new Vector(1, 1));

    assertThat(vector.getX()).isEqualTo(3);
    assertThat(vector.getY()).isEqualTo(3);
  }

  @Test
  void subtractVector() {
    Vector vector = new Vector(2, 2);

    vector.subtractVector(new Vector(1, 1));

    assertThat(vector.getX()).isEqualTo(1);
    assertThat(vector.getY()).isEqualTo(1);
  }

  @Test
  void addY() {
  }

  @Test
  void addX() {
  }

  @Test
  void subtractY() {
  }

  @Test
  void subtractX() {
  }

  @Test
  void setVector() {
  }

}