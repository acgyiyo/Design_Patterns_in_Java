package co.com.designpatterns.creational.abstractfactory.example2.factory2;

public class Credit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "PAgabdo con CREDITO";
  }
}
