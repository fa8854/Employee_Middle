public class Employee {
    private String fio;
    private int department;
    private double salary;
    private final int id;
    private static int number;
    public Employee(String fio,int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = getNumber();
        number++;
    }

    public String getFio(){
        return fio;
    }

    public int getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public int getNumber(){
        return number;
    }
    public void setSalary(double salary)    {
        this.salary = salary;
    }
    public void setFio(String fio)    {
        this.fio = fio;
    }
    @Override
    public String toString() {
        return "Сотрудник : " + fio + '\'' + ", Отдел " + department +
                ", Зарплата " + salary + " ID " + id;
    }
}
