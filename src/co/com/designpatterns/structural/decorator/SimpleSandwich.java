package co.com.designpatterns.structural.decorator;

/**
 * con esta calse concreta podemos crear el componente base o mínimo necesario para que haya una funcionalidad
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
