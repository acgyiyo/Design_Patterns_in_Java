package co.com.designpatterns.creational.singleton;

/**
 * este singleton esta protegido para que difernetes hilos corriendo en la misma maquina no puedan
 * obtener valores disntintos y siempre se garantice su valor
 */
public class DbSingletonThreadSafe {
    /**
     * lo primero que hacemos es colocar la instancia del objeto volatile, esto garantiza que nuestra variable
     * sea siempre accedida a la memoria principal del PC y no sea sacada de la memoria cache del CPU
     */
    private static volatile DbSingletonThreadSafe ourInstance = null;

    private DbSingletonThreadSafe() {
        //otro cambio que hacemos es garantizar que no se haga reflection sobre el objeto
        if (ourInstance != null) {
            throw new RuntimeException("Use getInstace() method to create");
        }
    }

    public static DbSingletonThreadSafe getInstance() {
        //aca vemos como crear la instacia si no exitste al momento de obtenerla(lazy init)
        if (ourInstance == null) {
            //adicional sincronizamos la creación del objeto en memoria para que solo acceda un hilo a la vez
            synchronized (DbSingletonThreadSafe.class) {
                if (ourInstance == null) {
                    ourInstance = new DbSingletonThreadSafe();
                }
            }
        }
        return ourInstance;
    }

}
