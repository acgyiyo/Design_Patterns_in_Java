package co.com.designpatterns.creational.factory;

import co.com.designpatterns.creational.factory.Pages.CartPage;
import co.com.designpatterns.creational.factory.Pages.ItemPage;
import co.com.designpatterns.creational.factory.Pages.SearchPage;

public class Shop extends Website{
    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
