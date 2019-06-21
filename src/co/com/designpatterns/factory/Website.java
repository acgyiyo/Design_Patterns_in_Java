package co.com.designpatterns.factory;

import co.com.designpatterns.factory.Pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebSite();
    }

    /**
     * metodo principal para crear websites con el patron
     */
    public abstract void createWebSite();

}
