package co.com.designpatterns.structural.bridge;

/**
 * aca vemos como el bride en este caso es una composición entre shape y color nos ayuda a
 * ahorrarnos código de crear muchas formas con disntintos colores (RedSquare, GreenCircle, etc)
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
