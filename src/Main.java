import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static final Employee[] employees = new Employee[10];



    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;}

    public static Employee getEmployeeMinSalary() {
        int min = employees[0].getSalary();
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeMaxSalary() {
        int max = employees[0].getSalary();
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static int calculateAverageSalary() {
        return calculateSumSalary() / employees.length;
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Григорьев Герман Иванович", 1, 40000);
        employees[1] = new Employee("Воронцов Федор Антонинович", 1, 42000);
        employees[2] = new Employee("Савельева Мирра Валерьяновна", 2, 41000);
        employees[3] = new Employee("Рожкова Ольга Борисовна", 2, 39500);
        employees[4] = new Employee("Лыткин Ким Кимович", 3, 42500);
        employees[5] = new Employee("Логинов Валерий Валерьевич", 3, 43000);
        employees[6] = new Employee("Баранова Жюли Платоновна", 4, 43500);
        employees[7] = new Employee("Зайцев Ираклий Альвианович", 4, 40500);
        employees[8] = new Employee("Иванков Ефим Глебович", 5, 44000);
        employees[9] = new Employee("Андреева Милена Игнатьевна", 5, 42500);


        for (int i = 0; i < employees.length; i++) {
            System.out.println("employees[i] = " + employees[i]);
        }
        System.out.println("calculateSumSalary() = " + calculateSumSalary());
        System.out.println("getEmployeeMinSalary() = " + getEmployeeMinSalary());
        System.out.println("getEmployeeMaxSalary() = " + getEmployeeMaxSalary());
        System.out.println("calculateAverageSalary() = " + calculateAverageSalary());

    }
}