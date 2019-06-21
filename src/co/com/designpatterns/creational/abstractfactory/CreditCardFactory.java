package co.com.designpatterns.abstractfactory;

import co.com.designpatterns.abstractfactory.creditcard.CreditCard;
import co.com.designpatterns.abstractfactory.validator.Validator;

/**
 * Abstract Factory
 * basicamente un abstract factory es un factory de factorys
 */
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

}
