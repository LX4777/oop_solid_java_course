package org.navigator;

public class Route implements IRoute {
  public ICoordinate[] coordinates;
  public Transport transport;

  Route(ICoordinate[] coordinates, Transport transport) {
    this.coordinates = coordinates;
    this.transport = transport;
  }

  @Override
  public void create() {
    System.out.println("Маршрут построен. Вид передвижения: " + transport.type);
  }
}
