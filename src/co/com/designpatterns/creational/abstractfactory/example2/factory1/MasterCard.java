package co.com.designpatterns.creational.abstractfactory.example2.factory1;

import co.com.designpatterns.creational.abstractfactory.example2.factory1.Card;

public class MasterCard implements Card {
  @Override
  public String getCardType() {
    return "MasterCard type";
  }

  @Override
  public String getCartdNumber() {
    return "654 MASTER";
  }
}
