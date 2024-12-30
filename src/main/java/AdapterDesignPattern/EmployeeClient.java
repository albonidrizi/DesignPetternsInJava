package AdapterDesignPattern;


import AdapterDesignPattern.adapter.EmployeeAdapterCSV;
import AdapterDesignPattern.adapter.EmployeeAdapterLdap;
import AdapterDesignPattern.model.Employee;
import AdapterDesignPattern.model.EmployeeCSV;
import AdapterDesignPattern.model.EmployeeDB;
import AdapterDesignPattern.model.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "Albon", "Idrizi", "idrizi@albon.com");
		
		employees.add(employeeFromDB);
		
		//Will not work! This is where the adapter comes into play!
		//Employee employeeFromLdap = new EmployeeLdap("ch33", "Sena", "Topi", "han@solo.com");

		//Using the adapter to make the employee from LDAP work with our system
		EmployeeLdap employeeFromLdap = new EmployeeLdap("ch33", "Sena", "Topi", "topi@sena.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		EmployeeCSV employeeFromCSV = new EmployeeCSV("5367,Kris,Berisha,berisha@kris.com");
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));


		return employees;
    }
	
}
