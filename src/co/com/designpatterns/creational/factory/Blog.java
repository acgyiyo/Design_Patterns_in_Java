package co.com.designpatterns.creational.factory;

import co.com.designpatterns.creational.factory.Pages.AboutPage;
import co.com.designpatterns.creational.factory.Pages.CommentPage;
import co.com.designpatterns.creational.factory.Pages.ContactPage;
import co.com.designpatterns.creational.factory.Pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());

    }
}
