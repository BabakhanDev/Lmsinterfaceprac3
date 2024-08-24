package practica_task3;

import practica_task3.models.Study;

import java.time.LocalDate;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        EducationCenter school = new School("N66", "Bishkek", LocalDate.of(1970, 5, 1));
        University university = new University("Garverd", "USA", LocalDate.of(1920, 5, 3));
        College college = new College("Keu", "KG", LocalDate.of(1950, 2, 25));


        Student student1 = new Student("Bek", "Israilov", "M", LocalDate.of(2012, 9, 2), school);
        Student student2 = new Student("Aida", "Jumabekova", "F", LocalDate.of(2011, 3, 12), college);
        Student student3 = new Student("Nursultan", "Ulanov", "M", LocalDate.of(2013, 6, 24), school);
        Student student4 = new Student("Aruzhan", "Beknazarova", "F", LocalDate.of(2012, 11, 15), university);
        Student student5 = new Student("Azamat", "Osmonov", "M", LocalDate.of(2012, 5, 8), school);
        Student student6 = new Student("Bermet", "Alieva", "F", LocalDate.of(2012, 7, 29), university);
        Student student7 = new Student("Ermek", "Sadykov", "M", LocalDate.of(2011, 10, 19), school);
        Student student8 = new Student("Gulzhan", "Nurbekova", "F", LocalDate.of(2013, 1, 7), college);
        Student student9 = new Student("Mirlan", "Tursunov", "M", LocalDate.of(2012, 2, 14), school);
        Student student10 = new Student("Aiperi", "Esenkulova", "F", LocalDate.of(2012, 12, 21), college);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("..................................");

       printStudentInfo(students);

    }

    public static void printStudentInfo(Student[] students) {
        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println();
        }

    }
}