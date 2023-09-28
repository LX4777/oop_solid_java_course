package org.lesson2;

public class YandexWebServiceProxy extends WebService {
  WebService webService = new YandexWebService();
  String[] cache = null;

  @Override
  public String[] getData() {
    if (this.cache == null) {
      this.cache = webService.getData();
    }
    return this.cache;
  }
}
