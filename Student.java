package practica_task3;

import practica_task3.models.Study;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducation(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", education=" + educationCenter +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + " окуу жайы: " + educationCenter.getName());
        }

    @Override
    public void getStudentsStudyingYear() {int years = LocalDate.now().getYear() - dateOfStart.getYear();
        System.out.println(name + " " + surname + " окууда: " + years + " жыл.");

    }
}


