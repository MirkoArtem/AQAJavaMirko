package Lesson_9.Task_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupStudents {
    static Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 17, Gender.MAN),
            new Student("Максим", 20, Gender.MAN),
            new Student("Екатерина", 20, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student implements Lesson_9.Task_4.Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name = '" + name + '\'' +
                    ", age = " + age +
                    ", gender = " + gender +
                    "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }
        @Override
        public int HashCode() {
            return Objects.hash(name, age, gender);
        }
    }
    public static void averageAge(){
        Double averageAgeOfStudents = students.stream()
                .filter((s) -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfStudents + ";");
    }
    public static void agendaForStudents(){
        Collection<Student> dumpWayToDie = students.stream()
                .filter((s) -> s.getAge() >= 18 && s.getAge() < 27 && s.getGender() == Gender.MAN)
                .collect(Collectors.toList());
        System.out.println("Слабое звено: " + dumpWayToDie + ";");
    }
}
