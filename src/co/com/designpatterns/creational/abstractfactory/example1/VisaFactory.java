package co.com.designpatterns.creational.abstractfactory.example1;

import co.com.designpatterns.creational.abstractfactory.example1.creditcard.CreditCard;
import co.com.designpatterns.creational.abstractfactory.example1.creditcard.VisaGoldCreditCard;
import co.com.designpatterns.creational.abstractfactory.example1.creditcard.VisaPlatinumCreditCard;
import co.com.designpatterns.creational.abstractfactory.example1.validator.Validator;
import co.com.designpatterns.creational.abstractfactory.example1.validator.VisaGoldValidator;
import co.com.designpatterns.creational.abstractfactory.example1.validator.VisaPlatinumValidator;

public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
        }
        return null;
    }

    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
        }
        return null;
    }
}
