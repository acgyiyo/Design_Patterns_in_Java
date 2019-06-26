package co.com.designpatterns.structural.adapter;

/**
 * tenemos una clase reciente
 */
public class EmployeeDB implements Employee {

    private String id;
    private String name;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getFirstName() {
        return name;
    }

    @Override
    public String getLastname() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  id + "," + name + "," + lastName + "," + email;
    }
}
