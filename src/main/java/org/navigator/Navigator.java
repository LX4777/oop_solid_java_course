package org.navigator;

public class Navigator implements INavigator {
  @Override
  public void start(IRoute[] routes) {
    for (IRoute route : routes) {
      route.create();
    }
  }
}
