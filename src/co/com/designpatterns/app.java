package co.com.designpatterns;

import co.com.designpatterns.creational.abstractfactory.CardType;
import co.com.designpatterns.creational.abstractfactory.CreditCardFactory;
import co.com.designpatterns.creational.abstractfactory.creditcard.CreditCard;
import co.com.designpatterns.creational.builder.LaunchOrder;
import co.com.designpatterns.creational.factory.WebSiteFactory;
import co.com.designpatterns.creational.factory.WebSiteType;
import co.com.designpatterns.creational.factory.Website;
import co.com.designpatterns.creational.prototype.Movie;
import co.com.designpatterns.creational.prototype.Registry;
import co.com.designpatterns.creational.singleton.DbSingleton;
import co.com.designpatterns.creational.singleton.DbSingletonLazy;
import co.com.designpatterns.creational.singleton.DbSingletonThreadSafe;
import co.com.designpatterns.structural.adapter.Employee;
import co.com.designpatterns.structural.adapter.EmployeeClient;
import co.com.designpatterns.structural.bridge.*;
import co.com.designpatterns.structural.composite.Menu;
import co.com.designpatterns.structural.composite.MenuItem;

import java.util.List;

public class app {

    public static void main(String[] args) {
//        testSingletonThreadSafe();
//        testBuilder();
//        testPrototype();
//        testFactory();
//        testAbstractFactory();
//        testAdapter();
//        testBridge();
        testComposite();
    }

    public static void testComposite() {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());

    }

    public static void testBridge() {
        Color blue = new Blue();
        Color red = new Red();

        Shape blueSquare = new Square(blue);
        Shape redCircle = new Circle(red);

        blueSquare.applyColor();
        redCircle.applyColor();
    }

    public static void testAdapter() {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }

    /**
     * es el mismo caso del factory pero con un nivel de asbtracción mayor ya que un abstract factory es un
     * factory de factorys
     */
    public static void testAbstractFactory() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(500);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }

    /**
     * podemos ver como construir un sitio web con un factory de una manera simple
     */
    public static void testFactory() {
        Website website = WebSiteFactory.getWebsite(WebSiteType.BLOG);
        System.out.println(website.getPages());

        website = WebSiteFactory.getWebsite(WebSiteType.SHOP);
        System.out.println(website.getPages());
    }

    //aca vemos como se implementa el patron builder
    public static void testBuilder() {
        LaunchOrder.Builder builder = new LaunchOrder.Builder();

        builder.bread("parmesano").condiments("sal").dressing("mayo").meat("pollo");

        LaunchOrder order = builder.build();

        System.out.println(order.getBread());
    }

    /**
     * aca vemos como se implementa el patro n prototype, donde creamos clones de los objetos gastanto poca memoria
     * este patron es perecto para hacer copias superficiales
     */
    public static void testPrototype() {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("movie");
        movie.setTitle("Avengers");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());
        System.out.println(movie.getPrice());

        Movie anotherMovie = (Movie) registry.createItem("movie");
        anotherMovie.setTitle("Hulk");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getPrice());
    }

    public static void testSingletonThreadSafe() {
        //creamos una instacia de la clase
        DbSingletonThreadSafe singleLazy = DbSingletonThreadSafe.getInstance();

        //imprimimos el valor del objeto
        System.out.println(singleLazy);

        //creamos otra instacia de la clase
        DbSingletonThreadSafe singleLazy2 = DbSingletonThreadSafe.getInstance();

        //vemos que las 2 instacias apunta al mismo espacio en memoria
        System.out.println(singleLazy2);
    }

    public static void testSingletonLazy() {
        //creamos una instacia de la clase
        DbSingletonLazy singleLazy = DbSingletonLazy.getInstance();

        //imprimimos el valor del objeto
        System.out.println(singleLazy);

        //creamos otra instacia de la clase
        DbSingletonLazy singleLazy2 = DbSingletonLazy.getInstance();

        //vemos que las 2 instacias apunta al mismo espacio en memoria
        System.out.println(singleLazy2);
    }

    public static void testSingleton() {
        //creamos una instacia de la clase
        DbSingleton single = DbSingleton.getInstance();

        //imprimimos el valor del objeto
        System.out.println(single);

        //creamos otra instacia de la clase
        DbSingleton single2 = DbSingleton.getInstance();

        //vemos que las 2 instacias apunta al mismo espacio en memoria
        System.out.println(single2);
    }

}
