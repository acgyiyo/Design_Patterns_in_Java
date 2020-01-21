package co.com.designpatterns.creational.factory.example2;

public class GooglePayment implements Payment {

  @Override
  public void doPayment() {
    System.out.println("Google payment");
  }
}
