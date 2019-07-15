package co.com.designpatterns.structural.decorator;

/**
 * esta clase representa una posibilidad de tantas para un decorator que pueda tener nuestra clase principal
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make()+addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
