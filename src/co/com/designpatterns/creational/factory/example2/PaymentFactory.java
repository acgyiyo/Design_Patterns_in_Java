package co.com.designpatterns.creational.factory.example2;

public class PaymentFactory {
  public static Payment buildPayment(PaymentTypeEnum paymentTypeEnum) {
    switch (paymentTypeEnum) {
      case CARD:
        return new CardPayment();
      case GOOGLE_PAY:
        return new GooglePayment();
      default:
        return null;
    }
  }
}
