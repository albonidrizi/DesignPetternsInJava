package AdapterDesignPattern.adapter;


import AdapterDesignPattern.model.Employee;
import AdapterDesignPattern.model.EmployeeCSV;
//
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.employeeCSV = employeeFromCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
