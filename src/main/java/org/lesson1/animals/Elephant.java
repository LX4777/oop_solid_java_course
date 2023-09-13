package org.lesson1.animals;

public class Elephant extends Animal {
  protected static final String SAYS = "Uuuu";
  private final double trunkLength;

  public Elephant(double trunkLength) {
    this.trunkLength = trunkLength;
  }

  public void say() {
    System.out.println(
        "The elephant says " + SAYS + "! My trunk is " + trunkLength + " inches long!!!");
  }
}
