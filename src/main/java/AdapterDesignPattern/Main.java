package AdapterDesignPattern;

import AdapterDesignPattern.model.Employee;
import java.util.List;

/**
 *   @author Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 *
 * @Adapter është një Structural Design Pattern që përdoret për të lejuar që dy klasa me ndërfaqe
 * të papërputhshme të punojnë së bashku. Ai vepron si një ndërmjetësues (adapter) që përkthen ndërfaqen e
 * një klase ekzistuese në një format që një klasë tjetër mund ta kuptojë.
 *Qëllimi i Adapter Pattern:
 * @1. Target (Objektivi): Ndërfaqja që klienti pret të përdorë.
 * @2. Adaptee: Klasa ekzistuese që duhet të përshtatet.
 * @3. Adapter: Klasa që përkthen ndërfaqen e Adaptee në atë që klienti pret.
 * @4. Client (Klienti): Kod që përdor ndërfaqen Target.
 */

public class Main {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}