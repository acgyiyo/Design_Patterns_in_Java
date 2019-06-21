package co.com.designpatterns.abstractfactory.validator;

import co.com.designpatterns.abstractfactory.creditcard.CreditCard;

public interface Validator {

    boolean isValid(CreditCard creditCard);
}
