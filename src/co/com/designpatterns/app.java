package co.com.designpatterns;

import co.com.designpatterns.builder.LaunchOrder;
import co.com.designpatterns.singleton.DbSingleton;
import co.com.designpatterns.singleton.DbSingletonLazy;
import co.com.designpatterns.singleton.DbSingletonThreadSafe;

public class app {

    public static void main(String[] args) {
//        testSingletonThreadSafe();
        testBuilder();
    }

    public static void testBuilder(){
        LaunchOrder.Builder builder= new LaunchOrder.Builder();

        builder.bread("parmesano").condiments("sal").dressing("mayo").meat("pollo");

        LaunchOrder order = builder.build();

        System.out.println(order.getBread());
    }

    public static void testSingletonThreadSafe(){
        //creamos una instacia de la clase
        DbSingletonThreadSafe singleLazy = DbSingletonThreadSafe.getInstance();

        //imprimimos el valor del objeto
        System.out.println(singleLazy);

        //creamos otra instacia de la clase
        DbSingletonThreadSafe singleLazy2 = DbSingletonThreadSafe.getInstance();

        //vemos que las 2 instacias apunta al mismo espacio en memoria
        System.out.println(singleLazy2);
    }

    public static void testSingletonLazy(){
        //creamos una instacia de la clase
        DbSingletonLazy singleLazy = DbSingletonLazy.getInstance();

        //imprimimos el valor del objeto
        System.out.println(singleLazy);

        //creamos otra instacia de la clase
        DbSingletonLazy singleLazy2 = DbSingletonLazy.getInstance();

        //vemos que las 2 instacias apunta al mismo espacio en memoria
        System.out.println(singleLazy2);
    }

    public static void testSingleton(){
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
