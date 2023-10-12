package org.lesson1.animals;

public class Tiger extends Animal {
  private Integer lines;
  protected static final boolean PREDATOR = true;
  protected static final String SAYS = "Rrrr";

  public Tiger(Integer lines) {
    this.lines = lines;
  }

  public void say() {
    System.out.println(
        "The tiger says: - \"I am very dangerous!!! I have " + lines + " lines!!!\"");
  }
}
