package co.com.designpatterns.factory;

import co.com.designpatterns.factory.Pages.AboutPage;
import co.com.designpatterns.factory.Pages.CommentPage;
import co.com.designpatterns.factory.Pages.ContactPage;
import co.com.designpatterns.factory.Pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());

    }
}
