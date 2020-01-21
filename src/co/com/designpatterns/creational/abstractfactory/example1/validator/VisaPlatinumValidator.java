package co.com.designpatterns.creational.abstractfactory.example1.validator;

import co.com.designpatterns.creational.abstractfactory.example1.creditcard.CreditCard;

public class VisaPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
