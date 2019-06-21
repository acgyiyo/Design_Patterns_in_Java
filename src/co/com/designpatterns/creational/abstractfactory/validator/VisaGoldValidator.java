package co.com.designpatterns.abstractfactory.validator;

import co.com.designpatterns.abstractfactory.creditcard.CreditCard;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
