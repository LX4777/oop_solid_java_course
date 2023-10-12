package org.lesson1.automotive;

public class Motorcycle extends Automotive {
  public Motorcycle(String model, IBattery battery, IEngine engine) {
    super(model, battery, engine);
  }

  @Override
  public void start() {
    System.out.println("Start the motorcycle");
  }

  @Override
  public void stop() {
    System.out.println("Stop the motorcycle");
  }
}
