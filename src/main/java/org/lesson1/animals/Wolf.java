package org.lesson1.animals;

public class Wolf extends Animal {
  protected static final boolean PREDATOR = true;
  private final Integer inTheBand;
  protected static final String SAYS = "Gav";

  public Wolf(Integer inTheBand) {
    this.inTheBand = inTheBand;
  }

  public void say() {
    System.out.println(
        "The wolf says: \"We are very dangerous!!! There are "
            + inTheBand
            + " of us!!! And we say "
            + SAYS
            + "!!!\"");
  }
}
