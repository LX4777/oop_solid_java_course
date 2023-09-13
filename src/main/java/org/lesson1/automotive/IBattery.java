package org.lesson1.automotive;

public interface IBattery {
  void charge();

  void discharge();

  void setModel(String $model);

  String getModel();

  void setCharge(double charge);

  double getCharge();
}
