package day37_CustomClass;

import java.sql.Struct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool { // Has A

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();

        student1.setInfo("Aaron", 'M', LocalDate.of(2000, 11, 2), "A01", 1.5);
        student2.setInfo("Daniel", 'M', LocalDate.of(1990, 10, 25), "B123", 3.2);
        student3.setInfo("Vanya", 'M', LocalDate.of(1998, 10, 12), "C324", 3.3);
        student4.setInfo("Jessica", 'F', LocalDate.of(1999, 8, 19), "G345", 5.3);
        student5.setInfo("Jennifer", 'F', LocalDate.of(1990, 12, 13), "F435", 2.3);
        student6.setInfo("Kostya", 'M', LocalDate.of(2000, 9, 7), "J09", 2.5);
        student7.setInfo("Adel", 'F', LocalDate.of(1999, 1, 20), "L092", 6.5);
        student8.setInfo("Bob", 'M', LocalDate.of(1989, 6, 29), "Y45", 1.3);
        student9.setInfo("John", 'M', LocalDate.of(2001, 7, 12), "L05", 1.3);
        student10.setInfo("Sanya", 'M', LocalDate.of(1990, 3, 29), "P93", 3.9);


        ArrayList<Student> cybertekSchool = new ArrayList<>();
        cybertekSchool.addAll(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8,
                student9, student10));


        Student studen11 = new Student();
        studen11.setInfo("Sanya", 'M', LocalDate.of(1990, 3, 29), "P93", 3.9);

        cybertekSchool.addAll(Arrays.asList(studen11));


        System.out.println(cybertekSchool);

        System.out.println("==============================================================");

        LocalDate youngest = cybertekSchool.get(0).DOfB;
        LocalDate oldest = cybertekSchool.get(0).DOfB;

        Student youngestStuden = null;// null is default value of all non primitives
        Student oldestStudent = null;


        for (Student each : cybertekSchool) {
            if (each.DOfB.isAfter(youngest)) { // whichever students date of birth after current youngest
                youngest = each.DOfB;
                youngestStuden = each;
            }
            if (each.DOfB.isBefore(oldest)) {
                oldest = each.DOfB;
                oldestStudent = each;

            }
        }
        System.out.println(youngest);
        System.out.println(youngestStuden);

        System.out.println(oldest);
        System.out.println(oldestStudent);

        System.out.println("==============================================");

        double highestGPA = cybertekSchool.get(0).gpa;
        double lowestGPA = cybertekSchool.get(0).gpa;

        for(Student eachStudent:cybertekSchool){
            double eachGPA = eachStudent.gpa;
            highestGPA = Math.max(eachGPA,highestGPA);

        }
        System.out.println("Highest GPA: "+highestGPA);


        double lowestGpa = cybertekSchool.get(0).gpa;
        for(Student eachStudent:cybertekSchool){
            double eachGpa = eachStudent.gpa;
            lowestGPA = Math.min(eachGpa,lowestGPA);

        }
        System.out.println("Lowest GPA: "+lowestGPA);

        System.out.println("========================Females=======================");

        ArrayList<Student> femaleStudents = new ArrayList<>(cybertekSchool);
        femaleStudents.removeIf(p->p.gender != 'F'); // remove genders if not male

        System.out.println(femaleStudents);

        System.out.println("========================Males===========================");

        ArrayList<Student> maleStudents = new ArrayList<>(cybertekSchool);
        maleStudents.removeIf(p->p.gender == 'F');
        System.out.println(maleStudents);

        System.out.println("=============Total number Female and Male=======================");
        System.out.println("Total numbers of Male students : "+maleStudents.size());
        System.out.println("Total number of Female students : "+femaleStudents.size());













    }

}
