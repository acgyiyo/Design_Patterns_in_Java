package co.com.designpatterns.creational.abstractfactory.example1.validator;

import co.com.designpatterns.creational.abstractfactory.example1.creditcard.CreditCard;

public interface Validator {

    boolean isValid(CreditCard creditCard);
}
