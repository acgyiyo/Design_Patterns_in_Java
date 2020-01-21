package co.com.designpatterns.creational.abstractfactory.validator;

import co.com.designpatterns.creational.abstractfactory.creditcard.CreditCard;

public interface Validator {

    boolean isValid(CreditCard creditCard);
}
