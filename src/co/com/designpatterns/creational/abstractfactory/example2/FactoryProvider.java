package co.com.designpatterns.creational.abstractfactory.example2;

import co.com.designpatterns.creational.abstractfactory.example2.factory1.CardFactory;
import co.com.designpatterns.creational.abstractfactory.example2.factory2.PaymentMethodFactory;

public class FactoryProvider {

  public static AbstractFactory getFactory(String choosedFactory) {
    if("CARD".equals(choosedFactory)){
      return new CardFactory();
    }else if("PAYMENT_METHOD".equals(choosedFactory)){
      return new PaymentMethodFactory();
    }
    return null;
  }
}
