package co.com.designpatterns;

import co.com.designpatterns.creational.abstractfactory.example1.CardType;
import co.com.designpatterns.creational.abstractfactory.example1.CreditCardFactory;
import co.com.designpatterns.creational.abstractfactory.example1.creditcard.CreditCard;
import co.com.designpatterns.creational.abstractfactory.example2.AbstractFactory;
import co.com.designpatterns.creational.abstractfactory.example2.FactoryProvider;
import co.com.designpatterns.creational.abstractfactory.example2.factory1.Card;
import co.com.designpatterns.creational.abstractfactory.example2.factory2.PaymentMethod;
import co.com.designpatterns.creational.builder.LaunchOrder;
import co.com.designpatterns.creational.factory.WebSiteFactory;
import co.com.designpatterns.creational.factory.WebSiteType;
import co.com.designpatterns.creational.factory.Website;
import co.com.designpatterns.creational.factory.example2.Payment;
import co.com.designpatterns.creational.factory.example2.PaymentFactory;
import co.com.designpatterns.creational.factory.example2.PaymentTypeEnum;
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
import co.com.designpatterns.structural.decorator.DressingDecorator;
import co.com.designpatterns.structural.decorator.MeatDecorator;
import co.com.designpatterns.structural.decorator.Sandwich;
import co.com.designpatterns.structural.decorator.SimpleSandwich;

import java.util.List;

public class app {

  public static void main(String[] args) {
//        testSingletonThreadSafe();
//        testBuilder();
//        testPrototype();
//    testFactory();
//    testFactoryExample2();
//        testAbstractFactory();
    testAbstractFactoryExample2();
//        testAdapter();
//        testBridge();
//        testComposite();
//    testDecorator();
  }

  private static void testDecorator() {
        /*lo que estamos haciendo es armar un decorator nuevo a partir de un componente base, poniendole varias utilidades extras
            un sandwich que es "pan" has a "carne" que a su ves has a "aderezo"
            no se debe confundir con un patron de tipo builder ya que no estamos construyendo un objeto base, si no que estamos
            agregando y modificando la estructura de uno existente(SimpleSandwich)*/
    Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

    System.out.println(sandwich.make());
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

  public static void testAbstractFactoryExample2() {
    //factoria de tipo CARD
    AbstractFactory abstractFactory = FactoryProvider.getFactory("CARD");
    Card card = (Card) abstractFactory.create("VISA");

    System.out.println(card.getCardType());

    //Facotria de tipo PaymentMethdo
    AbstractFactory abstractFactory2 = FactoryProvider.getFactory("PAYMENT_METHOD");
    PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create("DEBIT");
    System.out.println(paymentMethod.doPayment());

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

  public static void testFactoryExample2() {
    Payment payment = PaymentFactory.buildPayment(PaymentTypeEnum.CARD);
    payment.doPayment();

    payment = PaymentFactory.buildPayment(PaymentTypeEnum.GOOGLE_PAY);
    payment.doPayment();
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
