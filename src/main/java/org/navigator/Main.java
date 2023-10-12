package org.navigator;

public class Main {
  public static void main(String[] args) {
    INavigator navigator = new Navigator();
    // Микс
    Route[] routes = {
      new Route(
          new Coordinate[] {new Coordinate(0, 0), new Coordinate(10, 10)}, new BusTransport()),
      new Route(
          new Coordinate[] {new Coordinate(20, 20), new Coordinate(30, 30)}, new CarTransport()),
      new Route(
          new Coordinate[] {new Coordinate(40, 40), new Coordinate(50, 50)}, new NoTransport()),
    };
    navigator.start(routes);

    // Маршрут на одном транспорте
    Route[] routes2 = {
      new Route(
          new Coordinate[] {new Coordinate(20, 20), new Coordinate(30, 30)}, new CarTransport()),
    };
    navigator.start(routes2);
  }
}
