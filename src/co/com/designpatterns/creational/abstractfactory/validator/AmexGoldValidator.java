package co.com.designpatterns.creational.abstractfactory.validator;

import co.com.designpatterns.creational.abstractfactory.creditcard.CreditCard;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
