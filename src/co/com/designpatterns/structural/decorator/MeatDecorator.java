package co.com.designpatterns.structural.decorator;

/**
 * esta clase representa una posibilidad de tantas para un decorator que pueda tener nuestra clase principal
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make()+addMeat();
    }

    private String addMeat() {
        return " + chicken";
    }

}
