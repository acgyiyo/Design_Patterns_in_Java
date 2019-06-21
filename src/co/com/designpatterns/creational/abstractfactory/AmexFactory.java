package co.com.designpatterns.creational.abstractfactory;

import co.com.designpatterns.creational.abstractfactory.creditcard.AmexGoldCreditCard;
import co.com.designpatterns.creational.abstractfactory.creditcard.AmexPlatinumCreditCard;
import co.com.designpatterns.creational.abstractfactory.creditcard.CreditCard;
import co.com.designpatterns.creational.abstractfactory.validator.AmexGoldValidator;
import co.com.designpatterns.creational.abstractfactory.validator.AmexPlatinumValidator;
import co.com.designpatterns.creational.abstractfactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
