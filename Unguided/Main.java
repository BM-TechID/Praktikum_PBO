// 21102121_MANSUR JULIANTO_IF09R 

package Unguided;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Mansur", "123456", 1000000);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Juli", "654321", 5000000, 0.1, 2000000);
        ProjectPlanner projectPlanner = new ProjectPlanner("Anto", "987654", 8000000.0, 0.05, 5000000);

        Employee[] employees = {salariedEmployee, commissionEmployee, projectPlanner};

        for (Employee employee : employees) {
            employee.cetakInformasi();
        }
    }
}

