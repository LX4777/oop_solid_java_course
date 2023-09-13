package org.lesson1.automotive;

public abstract class Automotive implements IAutomotive {
  String model;
  IBattery battery;
  IEngine engine;

  public Automotive(String model, IBattery battery, IEngine engine) {
    this.battery = battery;
    this.engine = engine;
    this.model = model;
  }
}
