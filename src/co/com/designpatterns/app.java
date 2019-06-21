package co.com.designpatterns;

import co.com.designpatterns.builder.LaunchOrder;
import co.com.designpatterns.prototype.Movie;
import co.com.designpatterns.prototype.Registry;
import co.com.designpatterns.singleton.DbSingleton;
import co.com.designpatterns.singleton.DbSingletonLazy;
import co.com.designpatterns.singleton.DbSingletonThreadSafe;

public class app {

    public static void main(String[] args) {
//        testSingletonThreadSafe();
//        testBuilder();
//        testPrototype();
    }

    public static void testBuilder(){
        LaunchOrder.Builder builder= new LaunchOrder.Builder();

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
