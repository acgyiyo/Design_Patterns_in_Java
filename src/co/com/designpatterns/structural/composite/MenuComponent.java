package co.com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * esta va a ser la parte principal de la composición
 */
public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder sb = new StringBuilder(name);
        sb.append(": ");
        sb.append(url);
        sb.append("\n");
        return sb.toString();
    }
}
