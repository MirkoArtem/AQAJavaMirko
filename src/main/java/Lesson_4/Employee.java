package Lesson_4;

import java.util.Arrays;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phonenumber;
    private String salary;
    private String age;

    public Employee(String name, String surname, String patronymic, String position,
                    String email, String phonenumber, String salary, String age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", phonenumber = '" + phonenumber + '\'' +
                ", salary = '" + salary + '\'' +
                ", age = '" + age + '\'' +
                '}' + "\n";
    }

    public void info() {
        System.out.println("Имя: " + name + ";\n" + "Фамилия: " + surname + ";\n" + "Отчество: " + patronymic + ";\n"
                + "Должность: " + position + ";\n" + "Email: " + email + ";\n" + "Телефон: " + phonenumber + ";\n"
                + "Зарплата: " + salary + ";\n" + "Возраст: " + age + ";");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Артём", "Мирко", "Сергеевич", "Инженер",
                "aikmir64@gmail.com", "+375295438874", "5000", "23");
        employee1.info();

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new

                Employee("Иван", "Иванов", "Иванович", "Мастер",
                "IvanovMaster@gmail.com", "+375336986811", "2500", "24");

        emplArray[1] = new

                Employee("Роман", "Романько", "Романович", "Слесарь",
                "RomanShlesar@gmail.com", "+375336721845", "1250", "54");

        emplArray[2] = new

                Employee("Василий", "Василенко", "Васильевич", "Слесарь",
                "VasiliyShlesar@gmail.com", "+375336721815", "1350", "47");

        emplArray[3] = new

                Employee("Григорий", "Григорян", "Григорьевич", "Слесарь",
                "GriShlesar@gmail.com", "+375336721716", "1200", "44");

        emplArray[4] = new

                Employee("Петр", "Петрунько", "Петрович", "Слесарь",
                "PePeShlesar@gmail.com", "+375336721888", "1500", "42");
        System.out.println(Arrays.toString(emplArray));
    }
}
