package org.lesson1.animals;

public class Hare extends Animal {
  private final boolean PREDATOR = true;
  final String SAYS = "Hello";

  @Override
  public void say() {
    String type = PREDATOR ? "It's a predator." : "It's not a predator.";
    System.out.println("The hare says " + SAYS + "!" + type);
  }
}
