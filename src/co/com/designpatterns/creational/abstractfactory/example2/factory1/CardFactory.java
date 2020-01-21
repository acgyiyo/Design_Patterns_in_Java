package co.com.designpatterns.creational.abstractfactory.example2.factory1;

import co.com.designpatterns.creational.abstractfactory.example2.AbstractFactory;
import co.com.designpatterns.creational.abstractfactory.example2.factory1.Card;
import co.com.designpatterns.creational.abstractfactory.example2.factory1.MasterCard;
import co.com.designpatterns.creational.abstractfactory.example2.factory1.Visa;

public class CardFactory implements AbstractFactory<Card> {

  @Override
  public Card create(String type) {
    if ("VISA".equals(type)) {
      return new Visa();
    } else if ("MASTER".equals(type)) {
      return new MasterCard();
    }
    return null;
  }
}
