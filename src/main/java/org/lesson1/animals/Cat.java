package org.lesson1.animals;

public class Cat extends Animal {
  protected static final boolean PREDATOR = true;
  protected static final String SAYS = "Mya";

  @Override
  public void say() {
    String type = PREDATOR ? "It's a predator." : "It's not a predator.";
    System.out.println("The cat says " + SAYS + "! " + type);
  }
}
