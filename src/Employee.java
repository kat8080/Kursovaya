public class Employee {
    private final String FIO;
    private int department;
    private int salary;
    private static int сounter = 0;
    private final int id;



    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.id = сounter++;
    }

    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник: " +
                "Ф.И.О.-" + FIO +
                ", отдел-" + department +
                ", зарплата-" + salary +
                ", id-" + id ;
    }

}
