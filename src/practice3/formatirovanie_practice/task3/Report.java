package practice3.formatirovanie_practice.task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("ОТЧЕТ ПО ЗАРПЛАТЕ СОТРУДНИКОВ");
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            System.out.printf("%-28s %,17.2f %n", e.getFullname(), e.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 85000),
                new Employee("Петрова Анна Сергеевна", 120500.5),
                new Employee("Сидоров Пётр Алексеевич", 64999.99),
                new Employee("Кузнецова Мария Олеговна", 250000),
                new Employee("Смирнов Олег Дмитриевич", 47300.75)
        };
        generateReport(employees);
    }
}
