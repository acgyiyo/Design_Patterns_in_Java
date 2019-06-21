package co.com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    /**
     * aca se hace parte del truco, que es creando objetos clonados a partir del primero
     *
     * @param type
     * @return un clon del primer objeto creado
     */
    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    /**
     * en este metodo es el único lugar donde creamos objetos verdaderamente con "new" ademas dejamos información por defecto
     * para los objetos creados
     */
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Default movie");
        movie.setPrice(25.99);
        movie.setRunTime("2 hours");
        items.put("movie", movie);

        Book book = new Book();
        book.setTitle("default book");
        book.setNumberOfPages(560);
        book.setPrice(19.99);
        items.put("book", book);
    }
}
