package co.com.designpatterns.abstractfactory;

import co.com.designpatterns.abstractfactory.creditcard.CreditCard;
import co.com.designpatterns.abstractfactory.creditcard.VisaGoldCreditCard;
import co.com.designpatterns.abstractfactory.creditcard.VisaPlatinumCreditCard;
import co.com.designpatterns.abstractfactory.validator.Validator;
import co.com.designpatterns.abstractfactory.validator.VisaGoldValidator;
import co.com.designpatterns.abstractfactory.validator.VisaPlatinumValidator;

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
