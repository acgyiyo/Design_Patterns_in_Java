package co.com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * esta es la representación del cliente
 */
public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        //aca agregamos a nuestros empleados uno de la nueva clase
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        //si queremos uno de la clase legacy neceitamos el adaptator
        EmployeeLegacy employeeLegacy = new EmployeeLegacy("chewie", "solo", "han", "solo@han.com");

        employees.add(new EmployeeAdapterLegacy(employeeLegacy));

        return employees;
    }
}
