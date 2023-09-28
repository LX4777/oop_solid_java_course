package org.lesson2;

public class Main {
  public static void main(String[] args) {
    IClient client = new WebClient();
    client.request();
  }
}
