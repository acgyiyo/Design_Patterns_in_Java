package co.com.designpatterns.creational.abstractfactory.example2;

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
