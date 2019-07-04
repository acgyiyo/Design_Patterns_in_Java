package co.com.designpatterns.structural.composite;

import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * podemos ver como un menu esta compuesto por mas menus
 */
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(print(this));

        Iterator<MenuComponent> itr = menuComponents.iterator();
        while (itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            sb.append(menuComponent.toString());
        }
        return sb.toString();
    }
}
