package co.com.designpatterns.creational.abstractfactory.example2.factory2;

public class Debit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "pagando con DEBITO";
  }
}
