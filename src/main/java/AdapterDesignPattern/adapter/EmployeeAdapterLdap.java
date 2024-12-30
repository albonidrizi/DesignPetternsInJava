package AdapterDesignPattern.adapter;


import AdapterDesignPattern.model.Employee;
import AdapterDesignPattern.model.EmployeeLdap;

public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap employeeFromLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
