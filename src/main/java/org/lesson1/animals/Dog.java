package org.lesson1.animals;

public class Dog extends Animal {
  protected static final boolean PREDATOR = true;
  protected static final String SAYS = "Gav";

  @Override
  public void say() {
    String type = PREDATOR ? "It's a predator." : "It's not a predator.";
    System.out.println("The dog says " + SAYS + "!" + type);
  }
}
