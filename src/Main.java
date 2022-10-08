
public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        addEmployee();
        sumMouthSalary();
        minSalary();
        maxSalary();
        salaryMiddle();
        eployeefio();
        indexSalary();
        departmetsSum();
        departmetsMin();
        departmetsMax();
        departmetsMiddleSalary();
        departmentsIndexSelary(0.7);
        departments();
        salaryMin();
        salaryMax();
    }
    private static void addEmployee(){
       System.out.println("Список сотрудников");

           employees[0] = new Employee("Фили Моррис Иванович", 1,1000);
            employees[1] = new Employee("Александрова Татьяна Александровна", 1,2000);
            employees[2] = new Employee("Крытов Александр", 1,2400);
            employees[3] = new Employee("Иванов Иван", 3,5000);
            employees[4] = new Employee("Максим Самарцев", 4,100);
            employees[5] = new Employee("Алексей Веселов", 5,51500);
            employees[6] = new Employee("Александр Сидоренков", 4,30000.500);
            employees[7] = new Employee("Максим Глушаков", 2,12000);
            employees[8] = new Employee("Данил Оводов", 1,2000);
            employees[9] = new Employee("Корытко Александр", 2,34000);
            printEmployee();

       System.out.println();
   }
   private static void printEmployee(){
       for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            }
   }
    private static void sumMouthSalary(){
        double sum = 0;
        for (int i =0; i<= employees.length - 1;i++){
           sum =sum + employees[i].getSalary();
        }
           System.out.println("Сумма затрат на зарплату в месяц : " + sum);
           System.out.println();
       }
    private static void minSalary(){
        double min=Integer.MAX_VALUE;
        for (int i = 0; i <= employees.length-1; i++){
            if(employees[i].getSalary() < min) {
                min =employees[i].getSalary();
            }
        }
           System.out.println("Минимальная зарплата : " + min);
           System.out.println();
       }
    private static void maxSalary(){
           double max = 0;
           for (int i = 0; i <= employees.length - 1; i++){
               if(employees[i].getSalary() > max) {
                   max =employees[i].getSalary();
               }
           }
           System.out.println("Максимальная зарплата " + max);
           System.out.println();
       }
    private static void salaryMiddle(){
        double sum = 0;
        double middle;
        for (int i =0; i<= employees.length - 1;i++){
            sum =sum + employees[i].getSalary();
        }
        middle = sum / employees.length;
        System.out.println("Средняя зарплата : " + middle);
        System.out.println();
    }
    private static void eployeefio(){
           System.out.println("Список Ф.И.О. сотрудников");
           for (int i = 0 ; i<= employees.length - 1; i ++){
            System.out.println(employees[i].getFio());
        }
           System.out.println();
       }

    private static void indexSalary(){
        System.out.println("Индексация зарплат сотрудников");
        double index = 0.3;
           for (int i =0; i<= employees.length - 1;i++){
               employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary()* index);
               System.out.println("Зарплата увеличена " + employees[i].getFio() + " " + employees[i].getSalary() );
           }
           System.out.println();

       }

    private static void departments(){
           System.out.println("Сотрудники по отделам");
        int dep = 1;

                    for (int i =0; i<= employees.length- 1;i++){

                       if (employees[i].getDepartment() == dep){
                               System.out.println(employees[i].getFio()+ " " + employees[i].getSalary());
                       }
                   }

           System.out.println();
       }
       private static void departmetsMin(){
           int dep = 1;

           double min = Integer.MAX_VALUE;
           for (int i =0; i<= employees.length- 1;i++){
                if (employees[i].getDepartment() == dep){


                    if (employees[i].getSalary() < min){
                       min = employees[i].getSalary();
                   }
               }
       }
           System.out.println("Минимальная зарплата по отделу "+ min);
           System.out.println();
    }
    private static void departmetsMax(){
        int dep = 1;

        double max = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){


                if (employees[i].getSalary() > max){
                    max = employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата по отделу "+ max);
        System.out.println();
    }
    private static void departmetsSum(){
        int dep = 1;

        double sum = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){
                sum =sum + employees[i].getSalary();
                }
        }
        System.out.println("Сумма зарплаты по отделу " + sum);
        System.out.println();
    }
    private static void departmetsMiddleSalary (){
        int dep = 1;

        double middle =0;
        int department = 0;
        double sum = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){

                System.out.println(employees[i]);
                department = department + 1;
                sum =sum + employees[i].getSalary();
                middle = sum / department;
            }
        }
        System.out.println("Средняя зарплата по отделу : " + middle);
        System.out.println();
    }
    private static void departmentsIndexSelary(double index){
        System.out.println("Зарплата сотрудникам проиндексирована");

        int dep = 1;
        int department = 0;

        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){

                department = department + 1;
                System.out.println(employees[i]);
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary()* index);
                System.out.println("Зарплата увеличена " + employees[i].getFio() + " " + employees[i].getSalary() );
            }
        }
       System.out.println();
    }
    private static void salaryMin(){
        double salaryMin = 25000;
        System.out.println("Зарплата сотрудников меньше или равнв " + salaryMin);
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getSalary() <= salaryMin ){

                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }
    private static void salaryMax(){
        double salaryMax = 30000;

        System.out.println("Зарплата сотрудников больше или равнв " + salaryMax);

        for (int i =0; i<= employees.length- 1;i++){

            if (employees[i].getSalary() >= salaryMax ){
                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }


       }


