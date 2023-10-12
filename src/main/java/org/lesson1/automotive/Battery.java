package org.lesson1.automotive;

public class Battery implements IBattery {
  private String model;
  private double charged = 100;

  public Battery(String model) {
    this.model = model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void setCharge(double charge) {
    this.charged = charge;
  }

  public double getCharge() {
    return this.charged;
  }

  @Override
  public void charge() {
    System.out.println("Start charging battery!");
    this.charged = 100;
  }

  @Override
  public void discharge() {
    System.out.println("Start discharging battery!");
    this.charged = 0;
  }
}
