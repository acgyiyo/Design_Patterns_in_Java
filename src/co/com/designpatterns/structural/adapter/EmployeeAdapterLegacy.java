package co.com.designpatterns.structural.adapter;

/**
 * esta es la clase que sirve de adaptador entre el código viejo y las implementaciones nuevas
 */
public class EmployeeAdapterLegacy implements Employee {

    private EmployeeLegacy instance;

    public EmployeeAdapterLegacy(EmployeeLegacy instance) {
        this.instance = instance;
    }

    @Override
    public String getID() {
        return instance.getCod();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastname() {
        return instance.getSurName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLegacy{" +
                "instance=" + instance.getCod() + " - " + instance.getGivenName()+
        '}';
    }
}
