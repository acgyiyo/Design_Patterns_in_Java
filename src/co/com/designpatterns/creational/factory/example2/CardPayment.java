package co.com.designpatterns.creational.factory.example2;

public class CardPayment implements Payment {
  @Override
  public void doPayment() {
    System.out.println("Card payment");
  }
}
