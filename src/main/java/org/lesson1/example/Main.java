package org.lesson1.example;

import java.util.ArrayList;
import java.util.List;
import org.lesson1.animals.*;
import org.lesson1.automotive.*;

public class Main {
  public static void main(String[] args) {
    List<IAnimal> animals = new ArrayList<>();
    animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Elephant(100));
    animals.add(new Hare());
    animals.add(new Tiger(32));
    animals.add(new Wolf(10));
    animals.forEach(IAnimal::say);

    IBattery battery = new Battery("BOSCH");
    IEngine engine = new Engine("CUMMINS");
    Car car = new Gazelle(battery, engine);
    car.start();
    car.start();
  }
}
