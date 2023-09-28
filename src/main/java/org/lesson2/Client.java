package org.lesson2;

public abstract class Client implements IClient {
  @Override
  public void request() {
    WebService webService = new YandexWebServiceProxy();
    String[] response = webService.getData();
    for (String str : response) {
      System.out.println(str);
    }
  }
}
