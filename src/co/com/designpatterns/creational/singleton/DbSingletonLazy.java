package co.com.designpatterns.creational.singleton;

/**
 * la diferencia de este singleton es que no se carga al iniciar la aplicación si no, en el momento de
 * obtener la instacia
 */
public class DbSingletonLazy {

    private static DbSingletonLazy ourInstance = null;

    private DbSingletonLazy() {
    }

    public static DbSingletonLazy getInstance() {
        //aca vemos como crear la instacia si no exitste al momento de obtenerla
        if (ourInstance == null) {
            ourInstance = new DbSingletonLazy();
        }
        return ourInstance;
    }

}
