package co.com.designpatterns.abstractfactory;

import co.com.designpatterns.abstractfactory.creditcard.AmexGoldCreditCard;
import co.com.designpatterns.abstractfactory.creditcard.AmexPlatinumCreditCard;
import co.com.designpatterns.abstractfactory.creditcard.CreditCard;
import co.com.designpatterns.abstractfactory.validator.AmexGoldValidator;
import co.com.designpatterns.abstractfactory.validator.AmexPlatinumValidator;
import co.com.designpatterns.abstractfactory.validator.Validator;

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
