package co.com.designpatterns.creational.abstractfactory.example2;

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
