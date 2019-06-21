package co.com.designpatterns.abstractfactory.validator;

import co.com.designpatterns.abstractfactory.creditcard.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}