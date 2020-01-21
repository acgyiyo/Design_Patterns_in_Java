package co.com.designpatterns.creational.abstractfactory.example2.factory1;

import co.com.designpatterns.creational.abstractfactory.example2.factory1.Card;

public class Visa implements Card {
  @Override
  public String getCardType() {
    return "VISA type";
  }

  @Override
  public String getCartdNumber() {
    return "123456 VISA";
  }
}
