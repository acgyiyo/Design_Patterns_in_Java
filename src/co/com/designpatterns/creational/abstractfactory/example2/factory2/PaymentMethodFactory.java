package co.com.designpatterns.creational.abstractfactory.example2.factory2;

import co.com.designpatterns.creational.abstractfactory.example2.AbstractFactory;
import co.com.designpatterns.creational.abstractfactory.example2.factory2.PaymentMethod;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
  @Override
  public PaymentMethod create(String type) {
    if ("DEBIT".equals(type)) {
      return new Debit();
    } else if ("CREDIT".equals(type)) {
      return new Credit();
    }
    return null;
  }
}
