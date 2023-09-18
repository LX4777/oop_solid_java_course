package org.navigator;

public class Coordinate implements ICoordinate {
  private double longitude;
  private double latitude;

  Coordinate() {
    this.longitude = 0;
    this.latitude = 0;
  }

  Coordinate(double longitude, double latitude) {
    this.longitude = longitude;
    this.latitude = latitude;
  }

  @Override
  public void set(double longitude, double latitude) {
    this.longitude = longitude;
    this.latitude = latitude;
  }
  ;

  @Override
  public double[] get() {
    return new double[] {this.longitude, this.latitude};
  }
  ;
}
