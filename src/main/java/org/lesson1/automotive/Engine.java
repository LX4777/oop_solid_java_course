package org.lesson1.automotive;

public class Engine implements IEngine {
  private String model;

  public Engine(String model) {
    this.model = model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }
}
