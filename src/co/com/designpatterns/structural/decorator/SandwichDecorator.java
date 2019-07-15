package co.com.designpatterns.structural.decorator;

/**
 * tenemos una clase decorator que es la cual nos va a permitr "decorar o armar" la estructura de nuestros objetos personalizados
 */
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }

}
