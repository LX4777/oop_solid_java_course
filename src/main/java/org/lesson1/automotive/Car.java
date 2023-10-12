package org.lesson1.automotive;

public class Car extends Automotive {
  public Car(String model, IBattery battery, IEngine engine) {
    super(model, battery, engine);
  }

  @Override
  public void start() {
    System.out.println(
        "Start the car "
            + this.model
            + ". Battery: "
            + this.battery.getModel()
            + ". Engine: "
            + this.engine.getModel());
  }

  @Override
  public void stop() {
    System.out.println(
        "Stop the car "
            + this.model
            + ". Battery: "
            + this.battery.getModel()
            + " charge: "
            + this.battery
            + ". Engine: "
            + this.engine.getModel());
  }
}
