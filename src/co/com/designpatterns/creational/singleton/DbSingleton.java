package co.com.designpatterns.creational.singleton;

/**
 * nuestro primer singleton de ejemplo
 */
public class DbSingleton {

    //se crea un objeto de el mismo al crear la clase
    private static DbSingleton instance = new DbSingleton();

    //el constructor es privado para que nadie mas pueda crear instacias del objeto
    private DbSingleton() {
    }

    //tenemos un metodo get para obtener la única instacia de la clase que hay
    public static DbSingleton getInstance() {
        return instance;
    }
}
