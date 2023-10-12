package org.lesson1.animals;

public abstract class Animal implements IAnimal {
  protected static final boolean PREDATOR = false;
  protected static final String SAYS = "something";

  @Override
  public void say() {
    String type = PREDATOR ? "It's a predator." : "It's not a predator.";
    System.out.println("The animal says " + SAYS + "!" + type);
  }
}
